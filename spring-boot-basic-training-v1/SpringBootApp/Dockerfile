FROM adoptopenjdk:11-jre-hotspot

WORKDIR /app

COPY target/your-spring-app.jar app.jar

EXPOSE 8090

CMD ["java", "-jar", "app.jar"]
