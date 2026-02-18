package com.example.leastingredientmeal.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class themealdbresponse {

    private List<themealdbmeal> meals;

    public List<themealdbmeal> getMeals() {
        return meals;
    }

    public void setMeals(List<themealdbmeal> meals) {
        this.meals = meals;
    }

    public static class themealdbmeal {

        @JsonProperty("strMeal")
        private String strMeal;

        @JsonProperty("strIngredient1")
        private String strIngredient1;
        @JsonProperty("strIngredient2")
        private String strIngredient2;
        @JsonProperty("strIngredient3")
        private String strIngredient3;
        @JsonProperty("strIngredient4")
        private String strIngredient4;
        @JsonProperty("strIngredient5")
        private String strIngredient5;
        @JsonProperty("strIngredient6")
        private String strIngredient6;
        @JsonProperty("strIngredient7")
        private String strIngredient7;
        @JsonProperty("strIngredient8")
        private String strIngredient8;
        @JsonProperty("strIngredient9")
        private String strIngredient9;
        @JsonProperty("strIngredient10")
        private String strIngredient10;
        @JsonProperty("strIngredient11")
        private String strIngredient11;
        @JsonProperty("strIngredient12")
        private String strIngredient12;
        @JsonProperty("strIngredient13")
        private String strIngredient13;
        @JsonProperty("strIngredient14")
        private String strIngredient14;
        @JsonProperty("strIngredient15")
        private String strIngredient15;
        @JsonProperty("strIngredient16")
        private String strIngredient16;
        @JsonProperty("strIngredient17")
        private String strIngredient17;
        @JsonProperty("strIngredient18")
        private String strIngredient18;
        @JsonProperty("strIngredient19")
        private String strIngredient19;
        @JsonProperty("strIngredient20")
        private String strIngredient20;

        public String getStrMeal() {
            return strMeal;
        }

        public String[] getAllIngredients() {
            return new String[]{
                    strIngredient1, strIngredient2, strIngredient3, strIngredient4,
                    strIngredient5, strIngredient6, strIngredient7, strIngredient8,
                    strIngredient9, strIngredient10, strIngredient11, strIngredient12,
                    strIngredient13, strIngredient14, strIngredient15, strIngredient16,
                    strIngredient17, strIngredient18, strIngredient19, strIngredient20
            };
        }
    }
}
