# Multi-tenant Demo

1. Start H2

```
cd h2db && mvn spring-boot:run
```

1. Start Service1

```
cd service1 && mvn spring-boot:run
```

1. Start Service2

```
cd service2 && mvn spring-boot:run
```

H2 Console accessible on http://localhost:8080/h2-console as `jdbc:h2:tcp://localhost:9092/file:./target/camunda-h2-database`
