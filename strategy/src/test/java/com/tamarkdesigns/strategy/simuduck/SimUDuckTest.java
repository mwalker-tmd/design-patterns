package com.tamarkdesigns.strategy.simuduck;

import com.tamarkdesigns.strategy.model.Duck;
import com.tamarkdesigns.strategy.model.MallardDuck;
import com.tamarkdesigns.strategy.model.RubberDuck;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
//import static org.junit.jupiter.api.Assertions.*;

class SimUDuckTest {


  private static final String EXPECTED_WELCOME_MESSAGE = "Welcome to SimUDuck!!!";

  @Test
  @Tag("smoke")
  public void welcomeMessage_Success() {

    SimUDuck target = new SimUDuck();

    String actual = target.welcomeMessage();

    assertThat(actual, is(equalTo(EXPECTED_WELCOME_MESSAGE)));

  }

  /*
   * GIVEN: I have a game started.
   *
   * WHEN: The command to add a duck is given to the game ...
   *
   * THEN: The new duck is added to the collection of ducks
   */
  @Test
  @Tag("regression")
  public void addDuck_addsTheDuckToTheGame() {

    //setup
    SimUDuck target = new SimUDuck();

    //run
    target.addDuck(new MallardDuck());
    target.addDuck(new RubberDuck());

    //validate
    assertThat(target.getDucks().size(), is(equalTo(2)));
  }

}