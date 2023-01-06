FROM eclipse-temurin:17-jdk-ubuntu:18.04
VOLUME "/tmp"
COPY target/*.jar app.jar
ENTRYPOINT [ "java","-jar","/app.jar" ]



