package com.Interface.Laptop;

public class Dell implements Laptop{
    @Override
    public void displayDetails(){
        System.out.println("Dell Laptop Details");

    }
    @Override
    public void performAction() {
        System.out.println("Dell laptop is runnig Windows");
    }

}
