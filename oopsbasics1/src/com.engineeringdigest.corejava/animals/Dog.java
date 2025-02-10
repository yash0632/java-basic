package com.engineeringdigest.corejava.animals;

public class Dog extends Animal{


    public void makeSound(){
        System.out.println("woof woof");
    }

    @Override
    public void sayHello(){
        System.out.println("Woofi Woofi");
    }

    public void sayBye(){
        System.out.println("Bye bye");
    }

    @Override
    public void makeNoise(){
        System.out.println("Woof Woof");
    }

    public void growl(){
        System.out.println("Grrrrr");
    }
}
