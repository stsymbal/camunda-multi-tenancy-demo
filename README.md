# Multi-tenant Demo

Shared schema multi-tenancy demo

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
1. Start process instances for each tenant via tenant specific Task List
   http://localhost:8081/camunda/app/tasklist/Service1/
   http://localhost:8082/camunda/app/tasklist/Service2/

H2 Console is accessible via http://localhost:8080/h2-console as `jdbc:h2:tcp://localhost:9092/file:./target/camunda-h2-database`
