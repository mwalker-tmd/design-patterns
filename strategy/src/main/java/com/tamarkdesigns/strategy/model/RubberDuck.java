package com.tamarkdesigns.strategy.model;

public class RubberDuck extends Duck {
    @Override
    public void display() {
        System.out.println("I am a rubber duckie!");

    }

    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
