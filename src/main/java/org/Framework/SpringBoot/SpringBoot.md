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
- `spring.datasource.url=jdbc:mysql://localhost:3306/devDB`
- `spring.datasource.username=devUser`
- `spring.datasource.password=devPass`

### Embedded Servers
- Embedded servers in Spring, particularly Spring Boot, are web servers that are embedded
within the application's `JAR` or `WAR` (OLD Approach) file, allowing the application to run independently
without needing a separate server installation.
- With an embedded server, your Spring Boot application is self-contained. 
- You don’t need to deploy your application to an external server like Tomcat, Jetty, or Undertow separately. 
- Since the server is embedded, you can run your application with a simple `java -jar` command.

### Monitor Application Using Spring-Boot Actuator
- Spring Boot Actuator provides production-ready features to help you monitor and manage your application.
- Provides a number of endpoints:
  - **beans** - Complete list of Spring beans in your app.
  - **health** -Application health information. 
  - **metrics** - Application metrics.
  - **mappings** - Details around Request Mappings.
- `management.endpoints.web.exposure.include=*` for all endpoints.
- `management.endpoints.web.exposure.include=beans, health, metrics, env` for specific endpoints.

### Spring Boot vs Spring MVC vs Spring
#### Spring Framework: 
- The core of the Spring ecosystem, providing comprehensive infrastructure support for Java applications. 
- It includes features like Dependency Injection (DI), Aspect-Oriented Programming (AOP), data access, and more.

#### Spring MVC: 
- A module within the Spring Framework designed for building web applications following the Model-View-Controller (MVC) pattern. 
- It handles web requests, provides RESTful services, and integrates with other Spring modules.
- Eg.: @Controller, @RestController, @RequestMapping


#### Spring Boot: 
- A project built on top of the Spring Framework that simplifies the setup and development of new Spring applications. 
- It provides auto-configuration, embedded servers, and production-ready features to create standalone applications quickly.

#### Comparison
| Feature/Aspect       | Spring Framework                        | Spring MVC                         | Spring Boot                          |
|----------------------|-----------------------------------------|------------------------------------|--------------------------------------|
| **Scope**            | Comprehensive framework for Java        | Web framework within Spring        | Simplifies Spring application setup  |
| **Purpose**          | General-purpose enterprise development  | Building web applications          | Rapid development with Spring        |
| **Core Concepts**    | IoC, DI, AOP, Data Access, etc.         | MVC architecture, RESTful services | Auto-configuration, embedded servers |
| **Ease of Use**      | Requires more configuration             | Requires configuration             | Convention over configuration        |
| **Startup Time**     | Slower due to manual configuration      | Moderate                           | Fast due to auto-configuration       |
| **Application Type** | Any Java application                    | Web applications                   | Standalone, microservices, web apps  |
| **Dependencies**     | Manual dependency management            | Depends on Spring Framework        | Uses Spring Boot starters            |
| **Deployment**       | Requires external server (e.g., Tomcat) | Requires external server           | Embedded servers, standalone JAR/WAR |
| **Configuration**    | XML or Java-based                       | Annotations and XML/Java-based     | Mostly annotation and properties     |

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

### @PathVariable
- `@PathVariable` is used to extract values from the URI path. 
- It maps the dynamic values from the URI to method parameters in your controller.
- **e.g.,** When a request like `/users/123` is made,` @PathVariable("id")` will bind the value 123 to the id parameter.

### @RequestBody 
- `@RequestBody` is used to map the body of the HTTP request to an object in your method parameter. 
- It is commonly used for handling `POST`, `PUT`, and `PATCH` requests where you need to pass data to the server.
- `@RequestBody` will automatically deserialize the JSON (or XML) payload from the request body into a Java object.
