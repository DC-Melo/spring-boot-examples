package com.dc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// The @SpringBootApplication annotation is equivalent to using @Configuration,
// @EnableAutoConfiguration, and @ComponentScan with their default attributes
@SpringBootApplication
public class HelloApplication {

  public static void main(String[] args) {
    SpringApplication.run(HelloApplication.class, args);
  }

}
