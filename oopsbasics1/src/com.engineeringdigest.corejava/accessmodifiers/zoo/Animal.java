package com.engineeringdigest.corejava.accessmodifiers.zoo;

public class Animal {
    private String name;
    protected String sound;

    public Animal(){

        System.out.println("Animal Constructor Created");
    }

    void makeSound(){
        System.out.println(name + " make a sound: " + sound);
    }

    protected void changeSound(String newSound){
        this.sound = newSound;
    }


}
