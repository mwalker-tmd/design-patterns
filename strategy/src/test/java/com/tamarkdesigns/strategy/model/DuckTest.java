package com.tamarkdesigns.strategy.model;

import com.tamarkdesigns.strategy.simuduck.SimUDuck;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import javax.swing.*;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class DuckTest {

    /*
     * GIVEN: I have a game started with a number of ducks created.
     *
     * WHEN: The command to fly is given to a duck ...
     *
     * THEN:
     *      1. If it can fly, it flys.
     *      2. If it cannot fly, it does not fly.
     */
    @Test
    @Tag("regression")
    public void fly_ducksFlyOrDoNotFlyCorrectly() {

        //setup
        Duck duckThatCanFly = new MallardDuck();
        Duck duckThatCannotFly = new RubberDuck();

        SimUDuck game = new SimUDuck();
        game.addDuck(duckThatCanFly);
        game.addDuck(duckThatCannotFly);

        //run
        List<Duck> actualDucks = game.getDucks();

        //validate
        int flyCount = 0;
        int cannotFlyCount = 0;
        int unknown = 0;
        for (Duck actualDuck : actualDucks) {
            String flyResult = actualDuck.performFly();
            switch (flyResult) {
                case "I'm flying!!":
                    flyCount++;
                    break;
                case "I cannot fly.":
                    cannotFlyCount++;
                    break;
                default:
                    unknown++;
            }
        }
        assertThat(flyCount, is(equalTo(1)));
        assertThat(cannotFlyCount, is(equalTo(1)));
        assertThat(unknown, is(equalTo(0)));
    }



}