package com.engineeringdigest.corejava.animals;


public class Test {
    
    public static void main(String[] args){
        Cat cat = new Cat();
        cat.name = "yash";
        System.out.println(cat.name);
        
    }
    //signatures -> method name and parameters
    //method overloading -> name same but parameters different

    public static int sumOfArray(int[] arr){
        int res = 0;
        for(int i : arr){
            res += i;
        }
        return res;
    }

    private static String upperFun(String str){
        return str.trim().toUpperCase();
    }

    // private static int sum(int a,int b){
    //     return a + b;
    // }
    //method overloading -> method name and return type same but parameters different
    // private static int sum(int a,int b,int c){
    //     return a + b + c;
    // }

    public static void upper(Cat cat){
        cat.name = cat.name.toUpperCase();
        
    }

    public static int sum(int ...a){
        int sum = 0;
        for(int i : a){
            sum +=i;
        }
        return sum;
    }

    public static String fullName(String ...name){
        return String.join(" ",name);
    }

}
//polymorphism -> object of subclass can act as instance of parent or super class and can assign to reference of super class

//Abstraction -> Hiding Implementation details

