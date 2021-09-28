# Camunda Platform Multi-tenancy Demo

Dedicated schema-per-service with SharedUI (Cockpit, Tasklist, Admin) Camunda Platform multi-tenancy demo

1. Start H2
   ```
   cd h2db && mvn clean spring-boot:run
   ```
1. Start Service1
   ```
   cd service1 && mvn spring-boot:run
   ```
1. Start Service2
   ```
   cd service2 && mvn spring-boot:run
   ```
1. Start SharedUI
   ```
   cd shared-ui && mvn spring-boot:run
   ```
1. Start process instances for SharedUI Tasklist
   http://localhost:8083/camunda/app/tasklist/service1/
   http://localhost:8083/camunda/app/tasklist/service2/
1. The engines can be accessed via `BpmPlatform.getProcessEngineService()`, see [CustomApplicationListener class](shared-ui/src/main/java/com/bp3/consulting/workflow/CustomApplicationListener.java)

H2 Console is accessible via http://localhost:8080/h2-console as `jdbc:h2:tcp://localhost:9092/file:./target/camunda-h2-database`
