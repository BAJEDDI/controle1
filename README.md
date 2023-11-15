# controle1
# SpringBoot Stock Management

Manage your product inventory effortlessly with this SpringBoot-based RESTful API for stock management. The system handles articles and categories, providing essential CRUD operations through intuitive controllers.

## Project Overview

- **Entities:**
  - `Article`: Details about a product, such as name, description, and price.
  - `Category`: Categorization for articles.

- **Repositories:**
  - `ArticleRepository`: CRUD operations for articles.
  - `CategoryRepository`: CRUD operations for categories.

- **Controllers:**
  - `ArticleController`: Endpoints for fetching articles and displaying them for a given category between two dates.
  - `CategoryController`: Endpoints for fetching all categories and displaying articles associated with a category.

## Technologies

- **SpringBoot**: Java-based framework for building robust applications.
- **Swagger UI**: Explore and test the API through interactive documentation.

## API Documentation

Access API documentation using Swagger UI at [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html) after running the application.

## Testing with Postman

Use Postman to test the API. Import the provided collection (`StockManagement.postman_collection.json`) to get started quickly.

## Getting Started

1. Clone the repository.
2. Navigate to the project directory.
3. Run the application (`./mvnw spring-boot:run` or use your IDE).

## Author 
BAJEDDI
