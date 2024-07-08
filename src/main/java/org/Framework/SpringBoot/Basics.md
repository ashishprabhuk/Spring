# Spring Boot

### Spring Boot Starter
- A set of convenient dependency descriptors you can include in your application.
- For example, to build a web application, you include the `spring-boot-starter-web` dependency.

### Embedded Server
- Spring Boot applications come with an embedded server (like Tomcat, Jetty, or Undertow),
which allows you to run your application as a standalone Java application without needing a separate application server.

### Spring Boot starter projects
- Web Application & REST API - Spring Boot Starter Web ( spring-webmvc, spring-web, spring-boot-starter-tomcat, spring-boot-starter-json)
- Unit Tests - Spring Boot Starter Test
- Talk to database using JPA - Spring Boot Starter Data JPA
- Talk to database using JDBC - Spring Boot Starter JDBC
- Secure your web application or REST API - Spring Boot Starter Security

---

# Annotations

### @SpringBootApplication
- This is a convenience annotation that combines three annotations:
  - `@Configuration`: Tags the class as a source of bean definitions for the application context. 
  - `@EnableAutoConfiguration`: Tells Spring Boot to start adding beans based on classpath settings, other beans, and various property settings. 
  - `@ComponentScan`: Tells Spring to look for other components, configurations, and services in the specified package.

### @RestController
- A convenience annotation that combines `@Controller` and `@ResponseBody`. 
- It is used to create RESTful web services using Spring MVC.

### @RequestMapping
- Used to map web requests to specific handler functions or methods in the controller. 
- It can be applied to classes and methods.

### @GetMapping
- Used to handle HTTP GET requests.

### @PostMapping
- Used to handle HTTP POST requests.

### @PutMapping
- Used to handle HTTP PUT requests.

### @DeleteMapping
- Used to handle HTTP DELETE requests.

### @PatchMapping
- Used to handle HTTP PATCH requests, which are typically used for partial updates. 

### @GetMapping, @PostMapping, @PutMapping, @DeleteMapping, @PatchMapping: Specialized versions of @RequestMapping for specific HTTP methods (GET, POST, PUT, DELETE, PATCH).