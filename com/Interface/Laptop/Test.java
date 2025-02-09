package com.Interface.Laptop;

public class Test {
    public static void main(String[] args){
        Laptop dell = new Dell();      dell.displayDetails();
        dell.performAction();

        System.out.println();

        Laptop hp = new HP();
        hp.displayDetails();
        hp.performAction();

        System.out.println();

        Laptop Lenovo = new Lenovo();
        Lenovo.displayDetails();
        Lenovo.performAction();

        System.out.println();

        Laptop apple = new Apple();
        apple.displayDetails();
        apple.performAction();
    }
}

