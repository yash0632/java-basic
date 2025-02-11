package com.engineeringdigest.corejava.accessmodifiers.test;

import com.engineeringdigest.corejava.accessmodifiers.zoo.Animal;
import com.engineeringdigest.corejava.accessmodifiers.zoo.Dog;

public class Test extends Animal {



    public static void main(String[] args){
        Dog dog = new Dog("tom");
        Test test = new Test();
        test.changeSound("fghf");
        test.makeSound();


    }
}
//