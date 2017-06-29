# Spring Boot Hello World Sample

## Build:

```
./mvnw clean install
```

## Run:

```
java -jar hello-world-app/target/hello-world-app-0.0.1-SNAPSHOT.jar
```

## Invoke:

```
curl -H "Content-Type: text/plain" -d World :8080/
```

## Run with a different greeting:

```
java -jar hello-world-app/target/hello-world-app-0.0.1-SNAPSHOT.jar --greeter.greeting=Hola
```

Then invoke again as above.

