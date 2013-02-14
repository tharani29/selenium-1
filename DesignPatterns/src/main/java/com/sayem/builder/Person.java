package com.sayem.builder;

public class Person {

    private String firstName;
    private String lastName;
    private String id;
    private int age;
    private String email;

    public Person(String firstName, String lastName, String id, int age, String email){
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.age = age;
        this.email = email;
    }

    public String toString(){
        return "Person [firstName=" + firstName + ", lastName=" + lastName
                + ", id=" + id + ", age=" + ", email=" + email + "]";
    }
}
