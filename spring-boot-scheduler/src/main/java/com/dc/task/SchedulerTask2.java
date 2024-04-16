package com.dc.task;

import java.text.SimpleDateFormat;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * SchedulerTask1
 */
@Component
public class SchedulerTask2 {

  public static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

  @Scheduled(fixedRate = 5000)
  public void doTask() {
    System.out.println("task2 new date:" + dateFormat.format(new java.util.Date()));
  }
}
