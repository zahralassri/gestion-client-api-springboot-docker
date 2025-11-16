# Gestion Client API

**Spring Boot API for client management**, with MySQL and Docker Compose. Ready for future integration with Kafka and Kubernetes.

---

## 🛠 Tech Stack

- **Backend**: Spring Boot 3.x  
- **Database**: MySQL (running in Docker)  
- **Containerization**: Docker & Docker Compose  
- **Language**: Java 17  
- **Testing**: JUnit  
- **Messaging (future)**: Kafka  
- **Orchestration (future)**: Kubernetes

---

## 🚀 Prerequisites

- Java 17  
- Maven  
- Docker & Docker Compose  

---

## 📦 Build and Run Instructions

### 1️⃣ Build the project with Maven And Start the API and MySQL with Docker Compose

```bash
-mvn clean package -DskipTests

-docker compose up -d --build


