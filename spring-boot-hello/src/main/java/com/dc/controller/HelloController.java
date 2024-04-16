package com.dc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloController
 */
// RestController: RestController is used for making restful web services with
// the help of the @RestController annotation. This annotation is used at the
// class level and allows the class to handle the requests made by the client.
// Let’s understand @RestController annotation using an example. The
// RestController allows to handle all REST APIs such
// as GET, POST, Delete, PUT requests.
@RestController
public class HelloController {

  // You can use the @RequestMapping annotation to map requests to controllers
  // methods. It has various attributes to match by URL, HTTP method, request
  // parameters, headers, and media types. You can use it at the class level to
  // express shared mappings or at the method level to narrow down to a specific
  // endpoint mapping.
  @RequestMapping("/")
  public String index() {
    return "Hello Spring Boot!";
  }
}
