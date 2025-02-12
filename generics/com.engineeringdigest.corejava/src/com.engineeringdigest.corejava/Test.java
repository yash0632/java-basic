package com.engineeringdigest.corejava;

import java.util.logging.Logger;
import java.util.logging.Level;

enum Day{
    SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
}
public class Test {
    public static void main(String[] args){
        Test test = new Test();
        Integer[] intArray = {1,2,3,5};
        System.out.println(test.methofName(intArray));

    }

    public <T> T methofName(T[] parameter){
        return parameter[0];
    }
}

interface Printable{
    public void print();
}


class MyNumber extends Number implements Printable{
    private static final Logger logger = Logger.getLogger(String.valueOf(MyNumber.class));
    @Override
    public void print() {

        System.out.println("kya Khub lagti ho? badi sundar dikhti ho");
    }

    @Override
    public int intValue() {
        return 0;
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return 0;
    }
}
//Class & Interface
class Boxx<T extends Number & Printable>{
    private T item;

    public Boxx(T item){
        this.item = item;
    }

    public void display(){
        item.print();
    }

    public T getItem(){
        return item;
    }
}



