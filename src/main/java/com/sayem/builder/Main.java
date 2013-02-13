package com.sayem.builder;

public class Main {

    public static void main(String [] arg){

        PersonBuilder personBuilder = new PersonBuilder("Syed", " Sayem");
        Person person = personBuilder.setAge(30).setId("123456").setEmail("syed@hotmail.com").build();
        System.out.println(person.toString());

    }
}
