package org.Framework.SpringBoot.Basics;

public class User {
    private long id;
    private String name;
    private int age;
    private String gender;

    public User(long id, String name, int age, String gender) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "User {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
