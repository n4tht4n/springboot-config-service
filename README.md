# springboot-config-service

A Spring Boot applicationg running as a Spring Cloud Config Server, providing configuration data to other services.

## Setup

The original setup was done using [spring initializr](https://start.spring.io). This generated an already running
skeleton.

## Building

```bash
# build the JAR artifact, should be located in ./build/libs/
./gradlew bootJar
```

## Running

```bash
# most convenient command to run the app during development:
./gradlew bootRun

# to run the built JAR artifact manually:
java -jar build/libs/config-service-0.0.1-SNAPSHOT.jar

# to retrieve config data
http :8888/catalog-service/default
http :8888/catalog-service/prod
http :8888/catalog-service.yml
http :8888/catalog-service-prod.yml
```

## Containerizing

```bash
./gradlew bootBuildImage
```

## Pipeline

```bash
# to run `grype` to check for vulnerabilities:
./gradlew build
grype .
```
