package com.tamarkdesigns.strategy.simuduck;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
//import static org.junit.jupiter.api.Assertions.*;

class SimUDuckTest {

  @Test
  @Tag("fast")
  public void welcomeMessage_Success() {

    SimUDuck target = new SimUDuck();

    String actual = target.welcomeMessage();

    assertThat(actual, is(equalTo(SimUDuck.WELCOME_MESSAGE)));

  }

}