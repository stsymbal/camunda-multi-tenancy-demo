package com.bp3.consulting.workflow;

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableProcessApplication
public class Service2Application {

  public static void main(String... args) {
    SpringApplication.run(Service2Application.class, args);
  }

}
