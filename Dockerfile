FROM gradle:5.4.1-jdk8-alpine
USER root
COPY . /my-api
WORKDIR /my-api
RUN ./gradlew build
EXPOSE 8080
CMD ["java", "-jar", "/my-api/build/libs/my-api-0.0.1-SNAPSHOT.jar"]

