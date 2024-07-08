package org.Framework.SpringCore.Basics.Record;

//public record Person(String name, int age) {}

public record Person(String name, int age) {
    // Custom method
    public String greeting() {
        return "Hello, my name is " + name + " and I am " + age + " years old.";
    }

    // Custom constructor (if you need additional logic during initialization)
    public Person {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
    }
}