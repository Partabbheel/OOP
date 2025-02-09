package com.Interface.Laptop;

public class Apple implements Laptop{
    @Override
    public void displayDetails(){
        System.out.println("Apple Laptop Details");
    }
    @Override
    public void performAction(){
        System.out.println("Apple Laptop is running macOS");
    }
}

