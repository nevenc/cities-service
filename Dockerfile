FROM adoptopenjdk/openjdk11:alpine-jre
VOLUME /tmp

# Generate dependencies with 'mvn dependency:copy-dependencies'
COPY target/dependency			/app/lib
COPY target/classes			/app

ENTRYPOINT ["java","-cp","app:app/lib/*", "com.example.cities.CitiesServiceApplication"]
