FROM gradle:alpine
USER root
COPY . /my-api
WORKDIR /my-api
RUN ./gradlew build

FROM openjdk:8-alpine
COPY --from=0 my-api/build/libs/my-api-0.0.1-SNAPSHOT.jar .
EXPOSE 8080
CMD ["java", "-jar", "my-api-0.0.1-SNAPSHOT.jar"]
