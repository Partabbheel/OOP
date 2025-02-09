package com.Interface.Person;

public class Teacher implements Person{
    @Override
    public void displayDetails(){
        System.out.println("Subject: Secince Teacher");
    }
    @Override
    public void performAction(){
        System.out.println("Teaching as a Teacher");
    }

}
