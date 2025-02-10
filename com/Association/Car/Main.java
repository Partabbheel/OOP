package com.Association.Car;

public class
Main {
    public static void main(String[] args){
       Engine engine = new Engine();
       engine.setType("V8");

       Car car = new Car();

       car.setModel("Toyota");

        System.out.println("model:"+car.getModel());
        System.out.println("Engine Type:"+engine.getType());
    }
}
