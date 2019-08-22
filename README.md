# cities-service

Demo project for Spring Boot Beer Lovers.

## Build Application

```
./mvnw clean package
```

## Build Docker Container

* By adding `Dockerfile` you can build the container image, e.g.

```
FROM adoptopenjdk/openjdk11:alpine-jre
VOLUME /tmp
ARG JAR_FILE
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
```

```
docker build --build-arg JAR_FILE=target/cities-service-0.0.2-SNAPSHOT.jar -t nevenc/cities-service:0.0.2 -t nevenc/cities-service:latest .
```

## Run Application

```
java -jar target/cities-service-0.0.2-SNAPSHOT.jar
```

## Run Application in local Docker

```
docker run -d -p 8080:8080 nevenc/cities-service/latest
```

