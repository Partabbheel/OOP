package com.Interface.Person;

public class Student implements Person{
    @Override
    public void displayDetails(){
        System.out.println("Students ID , ");

    }
    @Override
    public void performAction(){
        System.out.println("Studying as a Student");
    }


}
