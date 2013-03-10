package com.sayem.reflectionapi.part2;

public class Vehicle {

    private String name = "";
    public int price = 0;
    protected String about = "";
    public String companyName = "";

    public Vehicle(){
        System.out.println("Vehicle(String vName):" + name);
    }

    public Vehicle(String carName, int price){
        this.name = carName;
        this.price = price;
        System.out.println("Vehicle(String carName, intPrice)" + "" + price);
    }

    public void setName(String name, int price){
        this.name = name;
        this.price = price;
        System.out.println("Name and Price is Set ::::" + " and " + price);
    }

    public void setCompanyName(String name){
        this.companyName = companyName;
        System.out.println("Company name is Set :>>" + companyName);
    }

    public int getPrice(){
        return price;
    }

    public void printDetails(){
        System.out.println("Vehicle name :" + name);
        System.out.println("Vehicle Price :" + price);
        System.out.println("Vehicle about :" + about);
        System.out.println("Vehicle CompanyName :" + companyName);
    }

}
