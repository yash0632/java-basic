package com.engineeringdigest.corejava.abstraction;

public abstract class Animal {

    private int age;
    private String name;

    private boolean hasSuperPowers;

    public Animal(){
        this.hasSuperPowers = false;
    }
    //if we want to declare amethod but not initialize it we create that method as abstract
    protected abstract void sayHello();
    //if we want to declare amethod but not initialize it we create that method as abstract

    public void sleep(){
        System.out.println("Animal is sleeping");
    }

    //the methods which has definition is called concrete method
    
}
