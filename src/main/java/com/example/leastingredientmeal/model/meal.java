package com.example.leastingredientmeal.model;

import java.util.List;

public class meal {

    private String name;
    private List<String> ingredients;
    private int ingredientCount;

    public meal(String name, List<String> ingredients, int ingredientCount) {
        this.name = name;
        this.ingredients = ingredients;
        this.ingredientCount = ingredientCount;
    }

    public String getName() {
        return name;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public int getIngredientCount() {
        return ingredientCount;
    }
}
