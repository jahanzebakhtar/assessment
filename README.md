# Assessment

Short project overview and purpose.

## Prerequisites

- Java 17
- Maven
- PostgreSQL (or Docker for running PostgreSQL)

## Getting Started

1. Clone the repository:
   ```bash
   git clone https://github.com/jahanzebakhtar/assessment.git
   cd assessment
2. Database Setup
    ```bash
    sudo docker run -d -e POSTGRES_HOST_AUTH_METHOD=trust -p 5432:5432 postgres:13
    createdb mydatabase

3. Run the application
    ```bash
   ./mvnw spring-boot:run
