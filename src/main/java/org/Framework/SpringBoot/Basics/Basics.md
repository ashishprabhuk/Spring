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

### Auto Configuration
- Spring Boot Auto Configuration automatically sets up your Spring application 
based on the libraries you include (jar dependencies), saving you time writing configurations.
- **Example**: Spring Boot Starter Web
  - Dispatcher Servlet (DispatcherServ1etÅutoConfiguration)
  - Embedded Servlet Container - Tomcat is the default (EmbeddedWebServerFactoryCustomizerAutoConfiguration)
  - Default Error Pages (ErrorMvcAutoConfiguration)
  - Bean <-> JSON (JacksonHttpMessageConvertersConfiguration)

### Spring Devtools
- Spring Boot DevTools pick up the changes and restart the application. 
- We can implement the DevTools in our project by adding the following dependency in the pom.
    - `org.springframework.boot spring-boot-devtools 3.2.2`
- Remember: For `pom.xml` dependency changes, we will need to restart server manually

### Logging Levels
- Define the granularity of the log messages.
  - **ERROR**: Serious issues.
  - **WARN**: Potential issues.
  - **INFO**: General operational messages.
  - **DEBUG**: Detailed debug information.
  - **TRACE**: Very fine-grained debug information.
1. **Dev**: Use `DEBUG` or `TRACE` to get detailed information for development and troubleshooting. 
2. **QA**: Use `INFO` or `DEBUG` to get enough detail for testing and verifying features. 
3. **Prod**: Use `WARN` or `ERROR` to log significant issues while minimizing the impact on performance and log size.

### Profiles
- Allow you to configure and deploy your application in different environments (dev, qa, prod). 
- Activate profiles via properties, command line, environment variables, or programmatically. 
- Define environment-specific configurations using profile-specific property files.
- (e.g., `application-dev.properties`, `application-qa.properties`, `application-prod.properties`).

### Configuration Properties
- Spring Boot automatically binds configuration values from properties files (e.g., `application.properties`) 
or environment variables to the corresponding fields in your Object. 
- Fields and property names need to match.
- `database.url=jdbc:mysql://localhost:3306/devDB`
- `database.username=devUser`
- `database.password=devPass`

### Embedded Servers
- Embedded servers in Spring, particularly Spring Boot, are web servers that are embedded
within the application's `JAR` or `WAR` (OLD Approach) file, allowing the application to run independently
without needing a separate server installation.
- With an embedded server, your Spring Boot application is self-contained. 
- You don’t need to deploy your application to an external server like Tomcat, Jetty, or Undertow separately. 
- Since the server is embedded, you can run your application with a simple `java -jar` command.

### Monitor Application Using Spring-Boot Actuator
- Monitor and manage your application in your production
- Provides a number of endpoints:
  - beans - Complete list of Spring beans in your app.
  - health -Application health information. 
  - metrics - Application metrics.
  - mappings - Details around Request Mappings.

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