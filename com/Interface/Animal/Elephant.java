package com.Interface.Animal;

import java.sql.SQLOutput;

public class Elephant implements Animal{
    @Override
    public void sound(){
        System.out.println("Trumpet");
    }
    @Override
    public void move(){
        System.out.println("Elephant is walking slowly");
    }

}
