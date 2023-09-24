FROM openjdk:17
EXPOSE 8080
LABEL maintainer="Ihab Fallahy"
COPY target/dynamoss.jar dynamoss.jar
ENTRYPOINT ["java", "-jar", "/dynamoss.jar"]