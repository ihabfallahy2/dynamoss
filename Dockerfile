FROM openjdk:17
LABEL maintainer="Ihab Fallahy"
COPY target/dynamoss.jar dynamoss.jar
ENTRYPOINT ["java", "-jar", "/dynamoss.jar"]