package com.engineeringdigest.corejava.accessmodifiers.test;

public class Student {
    public static int count = 0;

    private int id;
    private String name;
    private int age;

    static{
        System.out.println("hero");
    }

    public Student(){
        count++;
    }

    public int getAge() {
        return age;
    }



    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
