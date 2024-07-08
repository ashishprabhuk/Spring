# Java Records

## 1. Declaration Syntax
Records are declared using the `record` keyword followed by the record's name and a list of components (fields).

## 2. Immutable by Default
Records are immutable, meaning their state (the values of their components) cannot be changed once the record object is created.

## 3. Automatic Methods
When you define a record, the Java compiler automatically generates several methods:

- **Constructor**: A constructor that initializes the components of the record.
- **Getters**: Methods to retrieve the values of the record's components (e.g., `name()` and `age()`).
- **equals() and hashCode()**: These methods are overridden to compare two records by their component values.
- **toString()**: Generates a string representation of the record, useful for debugging.

## 4. Use Cases
Records are particularly useful in scenarios where you need simple data carriers with minimal boilerplate code. They can replace traditional Java beans (classes with private fields and public getters/setters) when immutability and concise syntax are preferred.
