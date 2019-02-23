FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG TARGET=target
COPY ${TARGET}/spring-boot-docker-1.0-SNAPSHOT.jar app.jar

ENTRYPOINT ["java","-jar","/app.jar"]
