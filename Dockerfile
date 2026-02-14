# =========================
# ১. BUILD STAGE
# =========================
FROM maven:3.9.6-eclipse-temurin-21 AS build
WORKDIR /app

# pom.xml কপি করে dependency গুলো ডাউনলোড করা
COPY pom.xml .
RUN mvn -B dependency:go-offline

# Source কোড কপি করে build করা
COPY src ./src
RUN mvn -B package -DskipTests

# =========================
# ২. RUNTIME STAGE
# =========================
FROM eclipse-temurin:21-jre-jammy
WORKDIR /app

# Build থেকে JAR কপি করা
COPY --from=build /app/target/Aelvynx_01-0.0.1-SNAPSHOT.jar app.jar
# Spring Boot port expose করা
EXPOSE 8070

# App রান করার command
ENTRYPOINT ["java", "-jar", "/app/app.jar"]