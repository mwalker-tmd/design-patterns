package com.tamarkdesigns.strategy.simuduck;

import com.tamarkdesigns.strategy.model.Duck;
import com.tamarkdesigns.strategy.model.MallardDuck;
import com.tamarkdesigns.strategy.model.RubberDuck;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SimUDuck {
  public static final String WELCOME_MESSAGE = "Welcome to SimUDuck!!!";

  private List<Duck> ducks = new ArrayList<>();

  public static void main(String[] args) {
    SimUDuck simUDuck = new SimUDuck();
    System.out.println(simUDuck.welcomeMessage());

    Duck duck1 = new MallardDuck();
    Duck duck2 = new RubberDuck();

    List<Duck> ducks = new ArrayList<>();
    ducks.add(duck1);
    ducks.add(duck2);
  }

  public String welcomeMessage() {
    return WELCOME_MESSAGE;
  }

  public void addDuck(Duck duckToAdd) {
    ducks.add(duckToAdd);
  }

  public List<Duck> getDucks() {
    return ducks;
  }
}
