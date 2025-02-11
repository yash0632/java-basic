package com.engineeringdigest.corejava.accessmodifiers.school;

class Student {
    public String name;
    private int age;
    private static Student instance;

    private Student(){

    }

    public Student getInstance(){
        if(Student.instance == null){
            Student.instance = new Student();
        }
        return Student.instance;
    }

    public void sayHello(){
        System.out.println("....");
    }
}


//Top level Class can be public or default default does not allow using class outside of package