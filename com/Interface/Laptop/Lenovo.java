package com.Interface.Laptop;

public class Lenovo implements Laptop{
    @Override
    public void displayDetails(){
        System.out.println("Lenovo Laptop Details");
    }
    @Override
    public void performAction(){
        System.out.println("Lenovo Laptop is running Windows");
    }
}
