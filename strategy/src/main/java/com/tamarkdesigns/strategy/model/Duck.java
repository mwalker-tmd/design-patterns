package com.tamarkdesigns.strategy.model;

import com.tamarkdesigns.strategy.behaviors.fly.Flyable;

public abstract class Duck {

    private Flyable flyable;

    public Duck() {
    }

    public Duck(Flyable flyable) {
        this.flyable = flyable;
    }

    public void quack() {
        System.out.println("quack");
    }

    public void swim() {
        System.out.println("Just keep swimming.");
    }

    public String performFly() {
        return flyable.fly();
    }

    public void setFlyable(Flyable flyable) {
        this.flyable = flyable;
    }

    public abstract void display();

}
