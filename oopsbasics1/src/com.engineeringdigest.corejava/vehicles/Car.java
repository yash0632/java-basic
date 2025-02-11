package com.engineeringdigest.corejava.vehicles;


public class Car extends Vehicle{


    private final int speedLimit = 200;

    public int getSpeedLimit() {
        return speedLimit;
    }



    public void drive(){
        System.out.println("Drive Car");
    }

    @Override
    public void accelerate(int val) {

    }

    @Override
    public void decelerate(int val) {

    }

    public final void airbags(){
        System.out.println("4 air bags");
    }


}
//final variable -> not reinitialized
//final method -> not overrided
//final class -> not extendable class
//final constructor