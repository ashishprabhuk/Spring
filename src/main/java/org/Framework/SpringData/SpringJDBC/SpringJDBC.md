# Spring JDBC

- Spring Data JDBC is a Spring module that provides integration with JDBC databases
using the familiar Spring Data programming model. 
- It offers an easy way to interact with databases using plain Java objects, 
eliminating the need for boilerplate code.

### JdbcTemplate 
- **JdbcTemplate** is a central class in the Spring JDBC framework that simplifies the use of JDBC and 
helps to avoid common errors such as resource leaks. 
- It provides methods to execute SQL queries, update statements, and manage connections.

### CommandLineRunner
- **CommandLineRunner** is an interface in the Spring Boot framework. 
- It is used to run a block of code right after the Spring application context is initialized. 
- This is particularly useful for performing startup tasks, such as initializing the database, loading default data, or running any setup scripts.
  - **Interface**: CommandLineRunner is a functional interface, which means it has a single abstract method, run(String... args).