package com.dc.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * SchedulerTask1
 */
@Component
public class SchedulerTask1 {

  private int count = 0;

  // Spring Boot using @Scheduled annotation for Task Scheduling. The @Scheduled
  // annotation is added to a method along with
  // some information about when to execute it, and Spring Boot takes care of the
  // rest.
  //
  // Spring Boot internally uses the TaskScheduler interface for scheduling the
  // annotated methods for execution.
  //
  // The purpose of this article is to build a simple project demonstrating all
  // the concepts related to task scheduling.
  @Scheduled(cron = "0/5 * * * * ?")
  public void doTask() {
    System.out.println("SchedulerTask1 doTask:" + count++);
  }
}
