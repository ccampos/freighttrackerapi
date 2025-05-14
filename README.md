# FreightTrackerAPI 🚛

FreightTrackerAPI is a Spring Boot REST API for managing shipments. It allows you to create, retrieve, update, and delete shipment records using a simple RESTful API. The API uses Spring Data JPA with an H2 in-memory database for fast and efficient data storage.

## 🚀 Features

* 🌐 RESTful API with Spring Boot (Java)
* 📦 Shipment management (CRUD operations)
* 💾 In-memory H2 database for quick setup and testing
* 📊 Lombok for reduced boilerplate code
* 🔧 Gradle for build automation

## 📌 Prerequisites

* Java 17+ (OpenJDK recommended)
* Gradle 8.x or higher

## 🚀 Getting Started

### 1. Clone the repository

```bash
git clone https://github.com/your-username/freighttrackerapi.git
cd freighttrackerapi
```

### 2. Build and run the application

```bash
./gradlew bootRun
```

### 3. Access the API

* API Base URL: `http://localhost:8080/api/shipments`
* H2 Database Console: `http://localhost:8080/h2-console`

## 📌 API Endpoints

* **GET /api/shipments** - Retrieve all shipments
* **POST /api/shipments** - Create a new shipment

  * Example request:

    ```bash
    curl -X POST http://localhost:8080/api/shipments \
    -H "Content-Type: application/json" \
    -d '{
      "destination": "New York, NY",
      "status": "In Transit",
      "date": "2025-05-13"
    }'
    ```

## ⚙️ Configuration

The application uses an in-memory H2 database by default for simplicity. No external database configuration is required. The database is reset on each application restart.

## 🌱 Future Enhancements

* ✅ Add validation for shipment data
* ✅ Implement detailed error handling
* ✅ Add Swagger UI for interactive API documentation
* ✅ Create a simple Angular front-end for a complete full-stack experience

## ⚡️ License

This project is licensed under the MIT License.
