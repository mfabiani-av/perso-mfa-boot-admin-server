<p align="center">
  <img width="80" src="./activeviam.svg" />
</p>
<h1 align="center">Spring Boot Admin server application</h1>
<p align="center">Simple Spring Boot application to host the Spring Boot Admin server and UI</p>

---

## 📋 Details
This project uses `spring-boot-admin-starter-server` to provide the Spring Boot Admin server and the Spring Boot Admin UI in a simple runnable Spring Boot Application.
Any Spring Boot application can then include the Spring Boot Admin client dependency and connect to this server to allow monitoring and management via the Spring Boot Admin UI.

For more details regarding Spring Boot Admin see:
- https://github.com/codecentric/spring-boot-admin
- https://www.baeldung.com/spring-boot-admin

#### Requirements
- Java 11
- Maven 3

Clone or download this repository and run `mvn clean install` (alternatively, run the `mvnw` script).
This will generate a jar file, which can be run using standard java commands.