package com.Interface.Animal;

public class Test {
    public static void main(String[] args){
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal cow = new Cow();
        Animal elephant = new Elephant();

        System.out.println("Dog Details");
        dog.sound();
        dog.move();
        System.out.println();

        System.out.println("Cat Details");
        cat.sound();
        cat.move();

        System.out.println("Cow Details");
        cow.sound();
        cow.move();
        System.out.println();

        System.out.println("Elephant Details");
        elephant.sound();
        elephant.move();
        System.out.println();

    }
}
