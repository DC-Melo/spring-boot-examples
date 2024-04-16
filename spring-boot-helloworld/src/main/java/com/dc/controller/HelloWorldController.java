package com.dc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloWorldController
 */
@RestController
public class HelloWorldController {

  @RequestMapping("/hello")
  public String index() {
    return "Hello Spring Boot!";
  }
}
