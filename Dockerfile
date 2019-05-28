FROM gradle:5.4.1-jdk8
WORKDIR /tmp
ADD build/libs/my-api-0.0.1-SNAPSHOT.jar my-api-01.jar
EXPOSE 8080
CMD ["java", "-jar", "my-api-01.jar"]