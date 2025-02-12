package com.engineeringdigest.corejava.multipleinheritance;

public interface Camera {
    public default void clickPhotos(){
        System.out.println("kheeching...");
    }
}
