package com.Interface.Person;

public class Employee implements Person{
    @Override
    public void displayDetails(){
        System.out.println("Department:"+"Computer Secince");
    }
    @Override
    public void performAction(){
        System.out.println("Working as an employee");
    }

}
