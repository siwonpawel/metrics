FROM openjdk:17-alpine as builder
COPY . /usr/src/counter
WORKDIR /usr/src/counter
RUN ./gradlew build


FROM openjdk:17-alpine
RUN mkdir /app
WORKDIR /app
COPY --from=builder /usr/src/counter/build/libs/metrics-0.0.1-SNAPSHOT.jar .
CMD ["java", "-jar", "/app/metrics-0.0.1-SNAPSHOT.jar"]
