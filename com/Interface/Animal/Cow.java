package com.Interface.Animal;

public class Cow implements Animal{
    @Override
    public void sound(){
        System.out.println("Moo");
    }
    @Override
    public void move(){
        System.out.println("Walking on four legs..");
    }

}
