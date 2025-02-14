package com.engineeringdigest.corejava;


import java.util.ArrayList;

public class Main {
    //static Logger logger = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) throws Exception {
    //     int[] arr = new int[5];
    //     ArrayList<String> list = new ArrayList<>();
    //     list.add("Hello");
    //    list.add("World");
    //    String s = list.get(0);
    //    String s1 = list.get(1);


    //     System.out.println(s + s1);

//        String str = (String)list.get(0);//downcasting
//        String integer = (String) list.get(1);
        //Type Safety Issue


//        Box<Integer> box = new Box<>();
//        box.setValue(1);
//
//        int i = box.getValue();
//        System.out.println(i);

        //Pair<String,Integer> pair = new Pair<>("yash",10);

        //Box<Integer> box = new Box<>();
        Box<String> stringBox = new Box<>();
        stringBox.setValue("hello");
        String value = stringBox.getValue();


    }
}
//Generics gives type safety at compile time

//Type Erasure -> After type checking compiler delete info about generics
class ClassName<T>{
    //Class body
}

//Naming convention