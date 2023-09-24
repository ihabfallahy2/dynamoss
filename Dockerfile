FROM openjdk:17
LABEL maintainer="HIITENFA"
COPY target/dynamoss.jar dynamoss.jar
ENTRYPOINT ["java", "-jar", "/dynamoss.jar"]