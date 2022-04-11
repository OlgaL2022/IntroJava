package com.sda.oop;

public class Bird extends Animal {

    private String color;
    private boolean doesItFly;


    public Bird(String color, boolean doesItFly) {
        this.color = color;
        this.doesItFly = doesItFly;
    }

    public void doesItFly() {
        if (doesItFly) {
            System.out.println("This bird likes to fly");
        } else {
            System.out.println("It can't fly");
        }
    }

    public void sing() {
        System.out.println("This bird sings a lot");
    }
}




