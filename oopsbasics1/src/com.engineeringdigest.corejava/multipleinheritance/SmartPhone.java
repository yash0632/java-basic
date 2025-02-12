package com.engineeringdigest.corejava.multipleinheritance;

public class SmartPhone implements Camera,Phone,MusicPlayer{
    @Override
    public void clickPhotos() {
        Camera.super.clickPhotos();
    }

    @Override
    public void call() {
        Phone.super.call();
    }

    @Override
    public void playMusic() {
        MusicPlayer.super.playMusic();
    }
}
//Encapsulation -> putting attributes and methods in private in one class
//Inheritance -> Accessing properties and behaviours of parentClass -> Method overriding
//Abstraction -> Data Hiding
//Polymorphism -> many forms
//compile time polymorphism vs run time polymorphism
//method overloading -> compile time polymorphism
//decision on which method to call is checked on compile time
//run time polymorphism ->