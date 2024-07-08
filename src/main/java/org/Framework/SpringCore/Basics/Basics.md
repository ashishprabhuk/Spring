# Spring

### Spring IoC (Inversion of Control)
- The **IoC container** is responsible for managing the lifecycle of Spring beans 
and their dependencies. 
- The container creates the beans, wires them together, configures them, 
and manages their entire lifecycle from creation to destruction.
- Instead of the programmer creating objects and managing their dependencies manually, 
the Spring Framework takes care of this.

### **Dependency Injection (DI)**
- **Dependency Injection (DI)** is a way to achieve IoC. 
- It means that the framework injects the necessary dependencies into a class, 
instead of the class creating them itself. 
- Identify beans, their dependencies and wire them together.
- DI can be achieved through three main types of injection:
  1. **Constructor Injection**: Dependencies are provided through a class constructor.
  2. **Setter Injection**: Dependencies are provided through setter methods.
  3. **Field Injection**: Dependencies are directly assigned to fields.

##### **How Spring IoC and DI Work Together**
Spring IoC uses DI to manage the components (beans) in an application. 
Here’s how they work together:
- **Bean Definition**: You define beans (components) and their dependencies in a configuration file (XML) or using annotations.
- **IoC Container**: The Spring IoC container reads these definitions and is responsible 
for instantiating, configuring, and assembling the beans.
- **Dependency Injection**: The IoC container injects the required dependencies into the beans.

### Autowiring
- Process of wiring in dependencies for a Spring beans.

### Spring Context
- Spring Context is a central interface to the Spring Framework.
- It provides configuration and management of beans (objects) within an application.
- The context is responsible for instantiating, configuring, and assembling the beans.


    var context = new AnnotationConfigApplicationContext(Person.class);
- This line initializes the Spring Context using the Person class for configuration. 
- `AnnotationConfigApplicationContext` is used to create an application context from Java-based configuration.

#### Application Context
- Advanced Spring IOC Container with enterprise-specific features. 
- Easy to use in web applications with internationalization features and good integration with Spring AOP.

### Beans
- In Spring, a bean is an object that is instantiated, assembled, and managed 
by the Spring IoC (Inversion of Control) container. 
- Beans are defined in configuration files (XML or Java configuration classes) 
and are annotated with `@Bean` to indicate to the Spring container that they are beans.

### Bean Factory
- Basic Spring IOC Container

### Configuration Class
- A configuration class is a class annotated with `@Configuration`, 
indicating that the class can be used by the Spring IoC container as a source of bean definitions.


### Dependency Injection
- Dependency Injection (DI) is a design pattern used to implement IoC, 
allowing a program to follow the dependency inversion principle. 
- Spring supports DI by providing the ability to inject beans into other beans.

#### Example
    @Bean
    public Identity identity1() {
        return new Identity("Developer", 30000, new Address("Chennai", "TN"));
    }

#### Calling Other Beans:
    @Bean
    public Identity identity2() {
        return new Identity(personJob(), personSalary(), address());
    }

#### Parameterized Bean:
    @Bean
    public Identity identity3(String personJob, int personSalary, Address newAddress) {
        return new Identity(personJob, personSalary, newAddress);
    }

### Component Vs Beans

| Topics             | Component                                                      | Beans                                                                                |
|--------------------|----------------------------------------------------------------|--------------------------------------------------------------------------------------|
| Where?             | Can be used on any class.                                      | Typically used on methods in Spring Configuration classes.                           |
| Ease of use        | Very easy, just add an annotation.                             | We need to write all the code.                                                       |
| Autowiring         | Yes - Field Setter or Constructor Injection.                   | Yes - method call or method parameters.                                              |
| Who creates Beans? | Spring Framework.                                              | We write Bean creation code.                                                         |
| Recommended for?   | Instantiating Beans for Your Own Application Code: @Component. | 1. Custom Business Logic <br> 2: Instantiating Beans for 3rd-party libraries: @Bean. |

---

# **Annotations**
#### **@Configuration**
- Indicates that this class contains one or more bean methods annotated with `@Bean` 
producing beans manageable by Spring.

#### **@Bean**
- annotation on methods defines a bean managed by the Spring container.

#### **@Autowired**
- `@Autowired` is an annotation in Spring that is used for automatic dependency injection. 
- It tells Spring to automatically find and inject the required bean into a class.
- **Automatic Injection**: When you mark a field, constructor, or setter method with `@Autowired`, 
Spring automatically finds the matching bean (an instance of a class) and injects it.
- **No Manual Wiring**: You don’t need to manually create or pass the dependency. Spring does it for you.


#### **@Primary**
- In Spring, the `@Primary` annotation is used to indicate which bean should be given preference 
when multiple beans of the same type are present. 
- When Spring encounters multiple candidate beans for a single dependency, 
the bean marked with `@Primary` will be the default choice.

#### **@Qualifier**
- If you need to inject a specific bean and override the `@Primary` setting, 
you can use the @Qualifier annotation.
- `@Qualifier` has higher priority than `@Primary`.

#### **@Component**
- An instance of a class managed by Spring-framework. 
- It allows Spring to automatically detect and register the class as a bean. 
- Component scanning, enabled through the `@ComponentScan` annotation, 
finds these classes and registers them in the Spring context.

#### **@ComponentScan**
- It tells Spring to scan the specified package for classes annotated with `@Component`. 
- Spring will create beans for those classes and manage their lifecycle.
- Only specify the package path if the component is from different package or else just `@ComponentScan` is enough.