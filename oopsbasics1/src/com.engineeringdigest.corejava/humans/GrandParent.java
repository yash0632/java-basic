package com.engineeringdigest.corejava.humans;

public class GrandParent {

    private String name;

    private int age;

    public GrandParent(){
        name = "akshit";
        System.out.println("Grandparent constructor calledv");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

}
