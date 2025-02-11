package com.engineeringdigest.corejava.test;
import com.engineeringdigest.corejava.animals.Dog;
import com.engineeringdigest.corejava.animals.Cat;
import com.engineeringdigest.corejava.animals.Animal;
import com.engineeringdigest.corejava.humans.Child;
import com.engineeringdigest.corejava.vehicles.EVCar;



public class Test {
    
    public static void main(String[] args) {


        //Animal dog = new Dog(); //upcasting

        //upcasting -> take an object and cast it to its superclass
        //downcasting -> take an object and cast it to its child class
        // casting -> explicit casting -> int <- (int)long
        // implicit casting -> long <- int

        //Cat myAnimal = new Cat();
        //myAnimal.makeNoise();

        //Any object that is subtype of animal is an animal
        //All child class have parent classes but not parent class have child class


        //doAnimalStuff(myAnimal);


        EVCar evCar = new EVCar();




    }


    public static void doAnimalStuff(Animal animal){
        animal.makeNoise();

        if(animal instanceof Dog){
            Dog myDog = (Dog)animal;
            myDog.growl();
        }
        else{
            System.out.println("BSDK");
        }

    }

}
//polymorphism -> object of subclass can act as instance of parent or super class and can assign to reference of super class

//Abstraction -> Hiding Implementation details

//method overriding -> child class override methods definition of parent class
//method overloading -> same method name but different parameters
//super -> it is a function which point to a parent of a child class and can call its method and constructor



