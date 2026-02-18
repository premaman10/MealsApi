# 🍽️ Least Ingredient Meal API

A Spring Boot REST API that fetches meals from the public **Themealdb API** and returns the meal with the least number of ingredients.

This project follows proper backend layered architecture:

- Controller Layer  
- Service Layer  
- Repository Layer  
- External API Integration  
- JSON Response Handling  
- Proper HTTP Status Codes  
- Tested using Postman  

---

# 📌 Project Objective

The goal of this project is to:

- Build a clean Spring Boot REST API  
- Integrate with an external API (Themealdb)  
- Process meal data dynamically  
- Identify the meal with the minimum number of ingredients  
- Return structured JSON output  
- Handle edge cases like null or empty responses  
- Use appropriate HTTP status codes  

---

# 🧠 Prompts Used to Generate This Project

## 1️⃣ Original Prompt (Provided)

> think your self a Full Stack Developer and your task is to build a simple REST API using Java Spring Boot that returns the meal with the least number of ingredients from a given list of meals. The data can be stored in memory or in a simple database, and no frontend is required since the API will be tested using Postman. The application should follow proper backend structure (Controller, Service, Repository), return the response in JSON format, handle basic edge cases like an empty list, and use appropriate HTTP status codes.

---

## 2️⃣ Optimized Professional Prompt

> Act as a senior backend developer and design a production-ready Spring Boot REST API that integrates with the public Themealdb API and returns the meal having the least number of valid ingredients. Follow clean layered architecture (Controller, Service, Repository), implement dependency injection, handle null or empty API responses, return structured JSON output, and use correct HTTP status codes. The API will be tested using Postman and does not require a frontend.

---

# 🏗️ Project Structure

com.example.leastingredientmeal
│
├── config
│ └── RestTemplateConfig.java
│
├── controller
│ └── MealController.java
│
├── service
│ └── MealService.java
│
├── repository
│ └── MealRepository.java
│
├── model
│ ├── Meal.java
│ └── ThemealdbResponse.java
│
└── LeastingredientmealApplication.java


---

# 🔄 Application Flow

Client (Postman)
↓
Controller
↓
Service (Business Logic)
↓
Repository (External API Call)
↓
Themealdb API


---

# 🌐 External API Used

https://www.themealdb.com/api/json/v1/1/search.php?s=


This API returns meals with up to 20 ingredient fields:

- strIngredient1  
- strIngredient2  
- ...  
- strIngredient20  

The service layer counts only non-null and non-empty ingredients.

---

# 📬 API Endpoint

## Get Meal With Least Ingredients

GET /api/meals/least-ingredients


### Full URL

http://localhost:8080/api/meals/least-ingredients


---
# ⚙️ Technologies Used
Java 17+

Spring Boot

RestTemplate

Maven

Jackson (JSON Mapping)

Postman (Testing)

# 🧪 Edge Cases Handled
Null API response

Empty meal list

Blank ingredient fields

Proper HTTP status codes

# 🚀 How to Run
Clone the repository

Open in IntelliJ IDEA or any Java IDE

Run LeastingredientmealApplication.java

Test the endpoint using Postman


# ✅ Success Response (200 OK)

```json
{
  "name": "Meal Name",
  "ingredients": [
    "Ingredient1",
    "Ingredient2"
  ],
  "ingredientCount": 2
}```

❌ Error Response (404 Not Found)
If no meals are found:

"no meals found"

