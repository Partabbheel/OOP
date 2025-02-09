package com.Interface.Animal;

public class Cat implements Animal{
    @Override
    public void sound(){
        System.out.println("meow");
    }
    @Override
    public void move(){
        System.out.println("cat is walking gracefully");
    }
}
