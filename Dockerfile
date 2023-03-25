# syntax = docker/dockerfile:1.2

FROM eclipse-temurin:17-alpine

VOLUME /tmp

WORKDIR /app

ARG JDBC_HOST
ARG JDBC_DB
ARG JDBC_USER
ARG JDBC_PORT
ARG JDBC_PASSWORD
ARG JWT_SECRET

ENV JDBC_HOST=${JDBC_HOST} JDBC_DB=${JDBC_DB} JDBC_USER=${JDBC_USER} JDBC_PORT=${JDBC_PORT} JDBC_PASSWORD=${JDBC_PASSWORD} JWT_SECRET=${JWT_SECRET}

EXPOSE 8080

COPY .mvn/ .mvn
COPY mvnw pom.xml ./
COPY src/ ./src/

RUN ./mvnw package -DskipTests


CMD ["java", "-jar", "target/ap-portfolio-backend-0.0.1-SNAPSHOT.jar"]
