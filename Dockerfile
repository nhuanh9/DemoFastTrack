
FROM openjdk:11-jre-slim

COPY demo.jar /app.jar

CMD ["java", "-jar", "/app.jar"]
