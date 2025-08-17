# -------------------------
# 1. Build Stage
# -------------------------
FROM maven:3.9.4-eclipse-temurin-17 AS build

WORKDIR /app

# Copy project files into container
COPY . .

# Build the Spring Boot application (skip tests for faster build)
RUN mvn clean package -DskipTests


# -------------------------
# 2. Run Stage
# -------------------------
FROM openjdk:17-jdk-slim

WORKDIR /app

# Copy the jar file from the build stage
COPY --from=build /app/target/*.jar app.jar

# Expose Spring Boot's default port
EXPOSE 8083

# Run the jar
ENTRYPOINT ["java", "-jar", "app.jar"]
