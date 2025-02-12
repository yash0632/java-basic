package com.engineeringdigest.corejava;


//Bounded Type Parameters
public class Box<T extends Number> {
    private T value;

    public Box(T value){
        this.value = value;
    }

    public T getValue(){
        return value;
    }

    public void setValue(T value){
        this.value = value;
    }
}
