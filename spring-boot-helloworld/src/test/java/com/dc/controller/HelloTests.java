package com.dc.controller;

// import org.junit.jupiter.api.Test;
// FIXIT: 
// [ERROR] Errors: 
// [ERROR]   HelloTests » InvalidTestClass Invalid test class 'com.dc.controller.HelloTests':
//   1. No runnable methods
// PASSED:
import org.junit.Test;
// INFO: diffrence org.junit.jupiter.api.Test and org.junit.Test
//                                   JUnit 4                                 |                    Jupiter
// Test                                                                      | Test
// The Test annotation tells JUnit that the public void method to which it is| @Test is used to signal that the annotated
// attached can be run as a test case.                                       | method is a test method.

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * HelloTests
 */
// When a class is annotated with @RunWith or extends a class annotated with
// @RunWith, JUnit will invoke the class it references to run the tests in that
// class instead of the runner built into JUnit. We added this feature late in
// development. While it seems powerful we expect the runner API to change as we
// learn how people really use it. Some of the classes that are currently
// internal will likely be refined and become public. For example, suites in
// JUnit 4 are built using RunWith, and a custom runner named Suite:
@RunWith(SpringRunner.class)
// Using this annotation will disable full auto-configuration and instead apply
// only configuration relevant to MVC tests (i.e. @Controller,
// @ControllerAdvice, @JsonComponent,
// Converter/GenericConverter, Filter, WebMvcConfigurer and
// HandlerMethodArgumentResolver beans but not @Component, @Service or
// @Repository beans). By default, tests annotated with @WebMvcTest will also
// auto-configure Spring Security and MockMvc (include support for HtmlUnit
// WebClient and Selenium WebDriver). For more fine-grained control of
// MockMVC the @AutoConfigureMockMvc annotation can be used. Typically
// @WebMvcTest is used in combination with @MockBean or @Import to create any
// collaborators required by your @Controller beans.
// If you are looking to load your full application configuration and use
// MockMVC, you should consider @SpringBootTest combined with
// @AutoConfigureMockMvc rather than this annotation.
@WebMvcTest(HelloWorldController.class)
public class HelloTests {

  // @Autowired is an annotation in Spring Framework that enables dependency
  // injection for Java classes. It allows Spring to
  // automatically inject dependencies into the class, eliminating the need for
  // manual configuration. This annotation can be
  // used to inject dependencies into fields, methods, and constructors.
  @Autowired
  // The Spring MVC Test framework, also known as MockMvc, provides support for
  // testing Spring MVC applications. It performs
  // full Spring MVC request handling but via mock request and response objects
  // instead of a running server.
  // MockMvc can be used on its own to perform requests and verify responses.
  // It can also be used through the WebTestClient
  // where MockMvc is plugged in as the server to handle requests with. The
  // advantage of WebTestClient is the option to work
  // with higher level objects instead of raw data as well as the ability to
  // switch to full, end-to-end HTTP tests against a
  // live server and use the same test API.
  private MockMvc mockMvc;

  @Test
  public void testHello() throws Exception {
    mockMvc.perform(MockMvcRequestBuilders
        .get("/hello")
        .accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk())
        .andDo(MockMvcResultHandlers.print())
        .andExpect(content().string(equalTo("Hello Spring Boot!")));

  }

}
