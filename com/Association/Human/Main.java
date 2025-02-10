package com.Association.Human;

public class Main {
    public static void main(String[] args){
        Heart heart = new Heart();
        heart.setBeats("72 beats per minute");
        Human human = new Human();
        human.setName("Man");

        System.out.println("Human Name:"+human.getName());
        System.out.println("Heart Beats:"+heart.getBeats());
    }
}

