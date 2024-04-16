package com.dc;

import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
// Annotation Interface EnableScheduling
// @Target(TYPE) @Retention(RUNTIME) @Import(SchedulingConfiguration.class)
// @Documented public @interface EnableScheduling
// Enables Spring's scheduled task execution capability, similar to
// functionality found in Spring's <task:*> XML namespace.
@EnableScheduling
public class SchedulerApplication {

  public static void main(String[] args) {
    SpringApplication.run(SchedulerApplication.class, args);
  }

}
