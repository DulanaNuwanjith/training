FROM openjdk:17-jdk-slim

WORKDIR /app

COPY /target/SpringBootApp-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8092

CMD ["java", "-jar", "app.jar"]

