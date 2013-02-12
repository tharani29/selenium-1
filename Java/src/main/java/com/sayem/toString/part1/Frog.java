package com.sayem.tostring.part1;

public class Frog {

    private int id;
    private String name;

    public Frog(int id, String name){
        this.id = id;
        this.name = name;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(id).append(" : ").append(name);
        return sb.toString();
    }

}
