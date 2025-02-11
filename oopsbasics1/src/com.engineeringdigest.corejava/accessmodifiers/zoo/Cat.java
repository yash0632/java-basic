package com.engineeringdigest.corejava.accessmodifiers.zoo;


public class Cat {
    String sound;
    public Cat(){
        Animal myAnimal = new Animal("godlf","dfghd");
        myAnimal.changeSound("fghdfg");
    }


}

//Protected can only be called directly in its subclass but not by creating an object of it