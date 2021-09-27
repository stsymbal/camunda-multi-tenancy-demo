package com.bp3.consulting.workflow;

import javax.sql.DataSource;

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Primary;


@SpringBootApplication
@EnableProcessApplication
public class SharedUI {
  public static void main(String... args) {
    SpringApplication.run(SharedUI.class, args);
  }
}
