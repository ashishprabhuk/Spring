# Advanced Features

### Lazy Initializer
- Lazy initialization is a concept in Spring Framework where beans are created and 
initialized only when they are first requested, rather than at the time of application startup. 
- This can lead to faster startup times and reduced memory usage, 
especially in applications with many beans where only a subset is used in a given runtime.

#### Lazy vs. Eager Initialization

| Topics                                            | Lazy Initialization                                               | Eager Initialization                              |
|---------------------------------------------------|-------------------------------------------------------------------|---------------------------------------------------|
| Initialization time                               | Bean initialized when it is first made use of in the application. | Bean initialized at startup of the application.   |
| Default                                           | Not Default.                                                      | Default.                                          |
| Code Snippet                                      | `@Lazy`                                                           | Absence of `@Lazy`                                |
| What happens if there are errors in initializing? | Errors will result in runtime exceptions.                         | Errors will prevent application from starting up. |
| Usage                                             | Rarely used.                                                      | Very Frequently used.                             |
| Memory Consumption                                | Less (until bean is initialized) .                                | All beans are initialized at startup.             |
| Recommended Scenario                              | Beans very rarely used in your app.                               | Most of your beans.                               |

### Scopes
#### Common Scopes
1. **SingletonBean**
   - Only one instance of this bean will exist in the Spring context.
2. **PrototypeBean** 
   - A new instance will be created each time it is requested.

| Heading                    | Prototype                                                    | Singleton                                                        |
|----------------------------|--------------------------------------------------------------|------------------------------------------------------------------|
| Instances                  | Possibly Many per Spring IOC Container                       | One per Spring IOC Container                                     |
| Beans                      | New bean instance created every time the bean is referred to | Same bean instance reused                                        |
| Default                    | NOT Default                                                  | Default                                                          |
| Code Snippet               | @Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)        | @Scope(value=ConfigurableBeanFactory.SCOPE_SINGLETON) OR Default |
| Usage                      | Rarely used                                                  | Very frequently used                                             |
| Recommended Scenario       | Stateful beans                                               | Stateless beans                                                  |


#### Web Scopes
1. **RequestBean**
   - A new instance will be created for each HTTP request.
2. **SessionBean**
   - A new instance will be created for each HTTP session.
3. **ApplicationBean**
   - A new instance will be created per ServletContext. 
4. **GlobalSessionBean** (Deprecated)
   - It is used in Portlet-based web applications.

### Java Singleton (GOF) vs Spring Singleton
- **Java Singleton** (GOF): One object instance per JVM.
- **Spring Singleton**: One object instance per Spring IoC container.

### PostConstruct and PreDestroy

| Annotation       | Execution Timing                                                                                       | Description                                                                                    |
|------------------|--------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------|
| `@PostConstruct` | Called once dependencies are injected and before the bean is available for use.                        | Used for initialization tasks that require dependencies to be fully injected.                  |
| `@PreDestroy`    | Called just before the bean is removed from the container (typically during shutdown or bean removal). | Used for cleanup tasks that should be performed before the bean is destroyed by the container. |

- **Use Cases**: These annotations are useful for 
managing resources (like opening/closing database connections) or 
- for initializing and releasing resources that should be tied to the lifecycle of the bean.

### Evolution of Jakarta EE: vs J2EE vs Java EE
- Enterprise capabilities were initially built into JDK
- With time, they were separated out:
   - J2EE - Java 2 Platform Enterprise Edition
   - Java EE - Java Platform Enterprise Edition (Spring 5)
   - Jakarta EE (Spring 6+ & Spring Boot 3+)
- **Important Specifications**:
   - Jakarta Server Pages (JSP)
   - Jakarta Standard Tag Library (JSTL)
   - Jakarta Enterprise Beans (EJB)
   - Jakarta RESTful Web Services (JAX-RS)
   - Jakarta Bean Validation
   - Jakarta Contexts and Dependency Injection (CDI)
   - Jakarta Persistence (JPA)


### Jakarta CDI (Contexts and Dependency Injection)
- `@Named` (CDI) vs. `@Component` (Spring): 
  - Both annotations are used to declare a bean. In Spring, `@Component` is part of the broader stereotype annotations including `@Service`, `@Repository`, and `@Controller`.
- `@Inject` (CDI) vs. `@Autowired` (Spring): 
  - Both annotations are used to inject dependencies into a class.

### Stereotype
- Stereotype annotations are used to declare that a class is a Spring-managed component.
- The primary stereotype annotations are:
  - `@Component`
  - `@Service`
  - `@Repository`
  - `@Controller`

---

## Annotations
 
##### @Lazy
- Can be used almost everywhere `@Component` qnd `@Bean` are used 
- Lazy-resolution proxy will be injected instead of actual dependency
- Can be used on Configuration Class
  - All `@Bean` methods within the `@Configuration` will be lazily initialized.

#### @Scope
- The `@Scope` annotation in Spring defines how the Spring container manages a bean's lifecycle
and visibility, determining whether a single instance is shared or 
new instances are created on each request.

#### @PostConstruct
- This annotation is used on a method that needs to be executed after dependency injection
is done to perform any initialization tasks.

#### @PreDestroy
- This annotation is used on a method that needs to be executed just before the bean
is removed from the container, typically to perform cleanup tasks.

#### @Named
- `@Named` is an annotation from Jakarta CDI. 
- It is used to declare a CDI managed bean and make it accessible by its name 
in a dependency injection environment.

#### @Inject
- The `@Inject` annotation is used to inject dependencies into a CDI managed bean. 
- It is the primary way to perform dependency injection in CDI, 
similar to Spring's `@Autowired` annotation.

#### @Component
- This is a generic stereotype for any Spring-managed component. 
- It's a general-purpose annotation that can be used to annotate any class 
you want to make a Spring bean.

#### @Service
- This annotation is a specialization of `@Component` and is used to indicate
that the class performs some service, typically business logic or service layer logic.

#### @Repository
- This annotation is also a specialization of `@Component` and is used to indicate
that the class is a Data Access Object (DAO). 
- It is responsible for encapsulating the logic for accessing data from a database or
another external source.
-  This annotation also helps in automatic exception translation.

#### @Controller
- This annotation is a specialization of `@Component` and is used to define a controller in the Spring MVC framework. 
- It is typically used to handle web requests and return a response.