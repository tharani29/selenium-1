package com.sayem.builder;

public class PersonBuilder {

    private String firstName;
    private String lastName;
    private String id = "";
    private int age = -1;
    private String email = "";

    public PersonBuilder(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person build(){
        return new Person(firstName, lastName, id, age, email);
    }


    public PersonBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public PersonBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public PersonBuilder setId(String id) {
        this.id = id;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setEmail(String email) {
        this.email = email;
        return this;
    }
}
