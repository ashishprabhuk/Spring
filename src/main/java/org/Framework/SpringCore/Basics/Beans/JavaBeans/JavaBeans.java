package org.Framework.SpringCore.Basics.Beans.JavaBeans;

import java.io.Serializable;

public class JavaBeans implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;
    private String name;
    private double salary;

    // No-argument constructor
    public JavaBeans() {}

    // Getter for id
    public String getId() {
        return id;
    }

    // Setter for id
    public void setId(String id) {
        this.id = id;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Setter for salary
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
