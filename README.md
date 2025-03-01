# Restful CRUD API with Spring Boot 3, Spring Data JPA, and MySQL

This project demonstrates how to build a simple RESTful CRUD (Create, Read, Update, Delete) API using **Spring Boot 3**, **Spring Data JPA**, and a **MySQL** database.

## Features

- **CRUD Operations**: Supports creating, reading, updating, and deleting resources via HTTP requests.
- **Spring Boot 3**: A fast and robust framework for building production-grade applications.
- **Spring Data JPA**: Simplifies data access with JPA (Java Persistence API) and integrates seamlessly with Spring Boot.
- **MySQL**: Uses a MySQL database to store data.
- **RESTful API**: Built according to REST principles, with endpoints for managing resources.

## Tech Stack

- **Spring Boot 3**: Framework for creating Java-based microservices and web applications.
- **Spring Data JPA**: A part of Spring that integrates JPA to interact with relational databases.
- **MySQL**: A relational database management system for storing data.
- **Hibernate**: ORM (Object-Relational Mapping) for interacting with the database.
- **Postman**: For testing API endpoints.

## Getting Started

### Prerequisites

To get started with this project, make sure you have the following tools installed:

- **Java 17** or higher
- **Maven** or **Gradle** (depending on your build tool)
- **MySQL** server installed locally or access to a MySQL database
- **IDE** (e.g., IntelliJ IDEA, VSCode) or a text editor for editing code

### Clone the Repository

```bash
git clone https://github.com/M-M-I-V/springboot.git
cd springboot
```

### Configuration

1. **Set up MySQL Database**:
   - Create a database in MySQL (e.g., `user_management`).
   - Update `src/main/resources/application.properties` with your MySQL credentials:

   ```properties
   spring.application.name=springboot-restful-web-services
   spring.datasource.url=jdbc:mysql://localhost:3306/user_management
   spring.datasource.username=root
   spring.datasource.password=
   spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
   spring.jpa.hibernate.ddl-auto=update
   ```

2. **Build the Project**:
   If you're using **Maven**, run the following command to build the project:

   ```bash
   mvn clean install
   ```

### Running the Application

To run the application, use the following Maven command:

```bash
mvn spring-boot:run
```

Once the application is up and running, it will be accessible at:

```
http://localhost:8080
```

### API Endpoints

The following endpoints are available in the API:

- **Create User**: `POST /api/users`
  - Request Body: JSON data for the resource to be created.
  - Response: HTTP status code 201 (Created).

- **Get All Users**: `GET /api/users`
  - Response: List of all resources in JSON format.

- **Get Users by ID**: `GET /api/users/{id}`
  - Response: A single resource in JSON format.

- **Update User**: `PUT /api/users/{id}`
  - Request Body: Updated JSON data for the resource.
  - Response: HTTP status code 200 (OK).

- **Delete User**: `DELETE /api/users/{id}`
  - Response: HTTP status code 200 (OK).

### Example Request

**Create a User** (POST):

```postman
POST http://localhost:8080/api/resources

{
  "firstName": "Neil Jay",
  "lastName": "Lacandazo"
  "email": "njlacandazo.mcst@gmail.com"
}
```

**Get All Users** (GET):

```postman
GET http://localhost:8080/api/users
```

**Get Specific User** (GET):

```postman
GET http://localhost:8080/api/users/1
```

**Update Specific User** (PUT):

```postman
PUT http://localhost:8080/api/users/1
```

**Delete Specific User** (DELETE):

```postman
DELETE http://localhost:8080/api/users/1
```

## Testing

You can test the API endpoints using tools like **Postman**.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
