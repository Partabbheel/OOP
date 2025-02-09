package com.Interface.Animal;

public class Dog implements Animal{
    @Override
    public void sound(){
        System.out.println("Woof woof");
    }
    @Override
    public void move(){
        System.out.println("Dog is runing");
    }
}
