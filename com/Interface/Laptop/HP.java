package com.Interface.Laptop;

public class HP implements Laptop{
    @Override
    public void displayDetails(){
        System.out.println("HP laptop Details");
    }
    @Override
    public void performAction(){
        System.out.println("HP Laptop is running Windows");
    }
}
