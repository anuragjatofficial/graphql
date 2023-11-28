FROM openjdk:17
WORKDIR /usr/src/app
COPY . /usr/src/app
RUN "mvn clean install"
COPY --from=build /usr/src/app/target/graphql-0.0.1-SNAPSHOT.jar graphql.jar
EXPOSE 8080
CMD ["java","-jar","graphql.jar"]