package com.tamarkdesigns.strategy.simuduck;

public class SimUDuck {
  public static final String WELCOME_MESSAGE = "unimplemented";

  public static void main(String[] args) {
    SimUDuck simUDuck = new SimUDuck();
    System.out.println(simUDuck.welcomeMessage());
  }

  public String welcomeMessage() {
    return WELCOME_MESSAGE;
  }
}
