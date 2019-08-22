# cities-service

Demo project for Spring Boot Beer Lovers.

## Build Application

```
./mvnw clean compile dependency:copy-dependencies
```

or with tests

```
./mvnw clean test dependency:copy-dependencies
```

## Build Docker Container

* By adding `Dockerfile` you can build the container image, e.g.

```
FROM adoptopenjdk/openjdk11:alpine-jre
VOLUME /tmp

# Generate dependencies with 'mvn dependency:copy-dependencies'
COPY target/dependency			/app/lib
COPY target/classes			/app

ENTRYPOINT ["java","-cp","app:app/lib/*", "com.example.cities.CitiesServiceApplication"]
```

```
docker build -t nevenc/cities-service:0.0.3 -t nevenc/cities-service:latest .
```

## Run Application

```
java -cp target/classes:target/dependency/* com.example.cities.CitiesServiceApplication
```

## Run Application in local Docker

```
docker run -d -p 8080:8080 nevenc/cities-service/latest
```

