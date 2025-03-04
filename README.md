# Learning Navigator

## Description

Learning Navigator is a Spring Boot application designed to manage students, exams, subjects, and contests. It provides CRUD (Create, Read, Update, Delete) operations via RESTful APIs for each entity, ensuring efficient management of educational resources.

## Features

- **Student Management**: Create, update, delete students. Enroll students in exams and subjects.
- **Exam Management**: Create, update, delete exams. Associate exams with subjects and students.
- **Subject Management**: Create, update, delete subjects. Manage subjects' curriculum and enrollment.
- **Contest Management**: (Assumed from prior context) Create, update, delete contests. Handle participant entries and outcomes.

## Technologies Used

- **Spring Boot**: Facilitates rapid development and deployment of Java applications. 
- **Spring Data JPA**: Simplifies database operations with ORM (Object-Relational Mapping) capabilities. 
- **Spring Web**: Supports building web applications using the MVC (Model-View-Controller) pattern. 
- **Spring Validation**: Ensures data integrity and validates input requests. 
- **MySQL**: Database management system used for persistent data storage. 
- **Lombok**: Reduces boilerplate code by automatically generating getters, setters, constructors, etc. 
- **Swagger UI**: Provides interactive documentation for RestFul APIs.

## Setup Procedure

### Prerequisites

- JDK 11 or higher installed 
- Maven build tool installed 
- Docker installed (for MySQL database)

### Steps to Setup

1. Clone the repository
   ``` bash
      git clone https://github.com/PushpanshuRanjanSingh/Learning-Navigator
      cd learning-navigator
   ```
2. Start MySQL Database
   Ensure Docker is running, then execute:
    ```bash
    docker-compose up -d
   ```
3. Build and Run the Application
    ```bash
    mvn clean install
    mvn spring-boot:run
    ``` 
4. Access Swagger UI
    Open a web browser and navigate to:
    ```bash
    http://localhost:8080/swagger-ui.html
    ```
    Swagger UI will display all available endpoints and allow you to interact with the API.
5. Import Postman Collection 

   [Postman-Collection-File](./External_Resource/Learning%20Navigator.postman_collection.json)

   [Step-by-Step Procedure](https://learning.postman.com/docs/getting-started/importing-and-exporting/importing-data/)
6. Requirement:

   [Problem Statement](./External_Resource/Week%202%20-%20Problem%20Statement_%20Learning%20Navigator.pdf)
   

### Usage

- Use Swagger UI to test and explore different endpoints. 
- Perform CRUD operations on students, exams, subjects, and contests as needed. 
- Integrate additional features or extend functionalities based on project requirements.
