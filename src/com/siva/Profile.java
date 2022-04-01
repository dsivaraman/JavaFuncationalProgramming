package com.siva;

public class Profile {
    private String name;
    private String lastName;
    private String age;

    public Profile() {
    }

    public Profile(String name, String lastName, String age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
