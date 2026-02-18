package com.example.leastingredientmeal.service;

import com.example.leastingredientmeal.model.meal;
import com.example.leastingredientmeal.model.themealdbresponse;
import com.example.leastingredientmeal.repository.mealrepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class mealservice {

    private final mealrepository mealrepository;

    public mealservice(mealrepository mealrepository) {
        this.mealrepository = mealrepository;
    }

    public meal getMealWithLeastIngredients() {

        // fetch meals from themealdb
        themealdbresponse response = mealrepository.fetchMeals();

        // handle null or empty response
        if (response == null || response.getMeals() == null || response.getMeals().isEmpty()) {
            return null;
        }

        meal leastIngredientMeal = null;

        // loop through all meals
        for (themealdbresponse.themealdbmeal m : response.getMeals()) {

            List<String> ingredientList = new ArrayList<>();

            // get all 20 possible ingredients
            for (String ingredient : m.getAllIngredients()) {
                if (ingredient != null && !ingredient.trim().isEmpty()) {
                    ingredientList.add(ingredient.trim());
                }
            }

            meal currentMeal = new meal(
                    m.getStrMeal(),
                    ingredientList,
                    ingredientList.size()
            );

            // compare and store minimum
            if (leastIngredientMeal == null ||
                    currentMeal.getIngredientCount() < leastIngredientMeal.getIngredientCount()) {

                leastIngredientMeal = currentMeal;
            }
        }

        return leastIngredientMeal;
    }
}
