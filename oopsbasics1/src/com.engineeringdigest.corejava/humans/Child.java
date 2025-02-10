package com.engineeringdigest.corejava.humans;

public class Child extends Parent{

    public Child(){
        super(10);
        //super(); -> hided which calls parent constructor
        System.out.println("Child Constructor called");

    }

    public void childMethod(){

        System.out.println("Child Method Called");
        super.parentMethod();
    }
}
