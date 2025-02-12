package com.engineeringdigest.corejava.multipleinheritance;

public interface Phone {
    public default void call(){
        System.out.println("Calling...");
    }
}
