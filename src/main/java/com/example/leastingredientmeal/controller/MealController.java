package com.example.leastingredientmeal.controller;

import com.example.leastingredientmeal.model.meal;
import com.example.leastingredientmeal.service.mealservice;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/meals")
public class MealController {

    private final mealservice mealservice;

    public MealController(mealservice mealservice) {
        this.mealservice = mealservice;
    }

    @GetMapping("/least-ingredients")
    public ResponseEntity<?> getMealWithLeastIngredients() {

        meal meal = mealservice.getMealWithLeastIngredients();

        if (meal == null) {
            return ResponseEntity.status(404).body("no meals found");
        }

        return ResponseEntity.ok(meal);
    }
}
