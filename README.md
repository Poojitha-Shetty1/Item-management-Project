# Item Management REST API

A clean and lightweight **Spring Boot REST API** for managing items using **in-memory storage**.  
This project was developed as part of a **freelancing technical task** to demonstrate backend development skills, RESTful API design, validation, and proper layered architecture.

---

## 🚀 Overview
The Item Management REST API allows users to create and retrieve item details through HTTP endpoints.  
The application does **not use a database**—all data is stored temporarily in memory using Java collections, making it simple, fast, and easy to run.

---

## ✨ Features
- RESTful API design
- Create and fetch items by ID
- In-memory data storage (no DB required)
- Input validation using Jakarta Bean Validation
- Clean layered architecture
- Easy to run and test

---

## 🛠 Tech Stack
- Java 17
- Spring Boot
- Spring Web
- Maven
- Jakarta Bean Validation
- Embedded Tomcat

---

## 📁 Project Structure
src/main/java
└── com.example.itemmanagement
├── controller # Handles HTTP requests
├── service # Business logic
├── repository # In-memory data storage
└── model # Item entity


## ⚙️ How to Run the Application

### Prerequisites
- Java 17 or higher
- Maven
- Git (optional)

### Steps
1. Clone the repository:
```bash
git clone https://github.com/Poojitha-Shetty1/Item-management-Project.git
Navigate to the project directory:

1.cd Item-management-Project
Run the application:

2.mvn spring-boot:run
The application will start on:

http://localhost:8080
🔗 API Endpoints
➕ Create Item
POST /api/items

Request Body

json
{
  "id": 1,
  "name": "Laptop",
  "description": "Dell Inspiron",
  "price": 55000
}

Response
json
{
  "id": 1,
  "name": "Laptop",
  "description": "Dell Inspiron",
  "price": 55000
}
🔍 Get Item by ID
GET /api/items/{id}

Example
GET /api/items/1
Success Response (200 OK)

json

{
  "id": 1,
  "name": "Laptop",
  "description": "Dell Inspiron",
  "price": 55000
}
Error Response (404 Not Found)
Item not found

✅ Validation Rules
id must not be null

Request body is validated using Jakarta Bean Validation

Invalid requests return 400 Bad Request

🧪 Testing the API
You can test the API using:

Postman
Any REST client

⚠ Important Notes
Uses in-memory storage

Data will be lost when the application restarts

No database configuration required

Designed for simplicity and clarity

🔮 Future Improvements
Add update and delete APIs

Add database integration (MySQL / PostgreSQL)

Add Swagger / OpenAPI documentation

Add unit and integration tests

Deploy to a cloud platform

