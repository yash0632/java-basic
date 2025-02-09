package com.engineeringdigest.corejava.test;

public class Student {
    
    String name;
    int rollnumber;
    private int age;
    double amount;
    
    public static void main2(String[] args){
        //local variable
        String name;

        
    }

    public void setAge(int age){
        if(age < 0){
            age = 0;
        }
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public void setAmount(double amount){
        if(amount > 0){
            this.amount = amount ;
        }   
        
    }

    public void deposit(double amount){
        if(amount > 0){
            this.amount += amount;
        }
    }

    public void withdraw(double amount){
        if( amount > 0 && this.amount >= amount){
            this.amount -= amount;
            System.out.println("Withdraw Amount: " + amount);
        }
    }

    public double getBalance(){
        return this.amount ;
    }
}
