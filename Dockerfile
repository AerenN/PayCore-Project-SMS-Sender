FROM openjdk:18-ea-11-jdk-alpine
## openjdk:11-jdk-alpine

MAINTAINER "Ali Eren Baysal"

# Spring Boot Embedded Tomcat Port: 9000
# Remote debugging port: 5005
EXPOSE 9000 5005
ADD target/sms-service-0.0.1-SNAPSHOT.jar sms-service.jar

ENTRYPOINT ["java","-jar","sms-service.jar"]

## Dockerizing the app
#
# Create a Spring Boot Application
# Create Dockerfile
# Build executable jar file - mvn clean package
# Build Docker image - docker build -t airport-reservation-app:v1 .
# Run Docker container using the image built - docker run --name airport-reservation-system -p 8080:8080 airport-reservation-applicaiton:v1
# Test

