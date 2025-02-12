package com.engineeringdigest.corejava.interfaces;

public interface Animal {

    int MAX_AGE = 150;

    public abstract void eat();

    void sleep();

    public static void info(){
        System.out.println("This is an Animal Interface");
    }

    public default void eating(){
        System.out.println("Can call from object of class with its properties also");
    }

}
//Blueprint for creating classes