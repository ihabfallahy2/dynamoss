FROM eclipse-temurin:17

LABEL mentainer="ihabfallahy@gmail.com"

WORKDIR /app

COPY target/dynamoss-0.0.2-SNAPSHOT.jar /app/dynamoss.jar

ENTRYPOINT ["java", "-jar", "dynamoss.jar"]