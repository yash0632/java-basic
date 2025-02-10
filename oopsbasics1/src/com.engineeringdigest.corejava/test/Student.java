package com.engineeringdigest.corejava.test;

public class Student {
    
    String name;
    int rollNumber;
    private int age;
    double amount;
    
    public Student(String name,int rollNumber,int age){
        this.age = age;
        this.name = name;
        this.rollNumber = rollNumber;
        
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
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}
