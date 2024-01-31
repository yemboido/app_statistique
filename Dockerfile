
FROM maven AS BUILD_STAGE
WORKDIR /app
COPY . .
RUN ["mvn", "clean", "package", "-DskipTests"]

# Run stage

FROM openjdk:slim
WORKDIR /app
COPY --from=BUILD_STAGE /app/target/*.jar app.jar
VOLUME /home/gow
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
