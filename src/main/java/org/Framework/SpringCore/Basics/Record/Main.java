package org.Framework.SpringCore.Basics.Record;

public class Main {
    public static void main(String[] args) {
        // Creating a record instance
        Person person = new Person("Ashish", 21);

        // Accessing the components
        System.out.println("Name: " + person.name()); // Output: Name: Ashish
        System.out.println("Age: " + person.age());   // Output: Age: 21

        // Using the automatically generated toString() method
        System.out.println(person); // Output: Person[name=Ashish, age=21]

        // Creating another record instance with the same values
        Person anotherPerson = new Person("Ashish", 21);

        // Checking equality (using the automatically generated equals() method)
        System.out.println(person.equals(anotherPerson)); // Output: true

        // Checking hash codes (using the automatically generated hashCode() method)
        System.out.println(person.hashCode() == anotherPerson.hashCode()); // Output: true

        // Attempting to create a record instance with invalid age
        try {
            Person invalidPerson = new Person("John", -5);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // Output: Age cannot be negative
        }
    }
}
