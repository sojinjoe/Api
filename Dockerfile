FROM openjdk:11-jre-slim
COPY build/libs/control-center-0.0.1-SNAPSHOT.jar /app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
