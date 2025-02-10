package com.engineeringdigest.corejava.animals;

public class Dog extends Animal{
    public void makeSound(){
        System.out.println("woof woof");
    }

    @Override
    public void sayHello(){
        System.out.println("Woof Woof");
    }
}
