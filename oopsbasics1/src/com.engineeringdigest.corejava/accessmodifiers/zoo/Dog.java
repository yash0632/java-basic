package com.engineeringdigest.corejava.accessmodifiers.zoo;

public class Dog extends Animal{

    public Dog(String name){

        System.out.println("Dog Constructor Created!");
    }

    public void wagTail(){
        System.out.println(getname() + " is waging its tail.");
    }

    private String getname(){
        return getClass().getSimpleName();
    }

    private void setSound(String sound){
        changeSound(sound);
    }


}
//protected -> only child class can access this value