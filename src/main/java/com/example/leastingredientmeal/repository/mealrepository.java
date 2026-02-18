package com.example.leastingredientmeal.repository;

import com.example.leastingredientmeal.model.themealdbresponse;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class mealrepository {

    private final RestTemplate restTemplate;

    public mealrepository(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public themealdbresponse fetchMeals() {
        String url = "https://www.themealdb.com/api/json/v1/1/search.php?s=";
        return restTemplate.getForObject(url, themealdbresponse.class);
    }
}
