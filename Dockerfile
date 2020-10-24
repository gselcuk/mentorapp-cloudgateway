FROM openjdk:13-jdk-alpine
VOLUME /tmp
COPY target/*.jar mentorapp-cloudgateway.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/mentorapp-cloudgateway.jar"]