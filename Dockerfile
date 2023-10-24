
FROM openjdk:11-jre-slim

COPY  build/libs/demo-0.0.1-SNAPSHOT.jar /app.jar

CMD ["java", "-jar", "/app.jar"]
