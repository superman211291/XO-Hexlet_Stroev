package io.hexlet.xo.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void testGetName() {
        final String inputValue = "Ilya";

        final String expectedValue = /*"12345"*/ inputValue;

        final Player player = new Player(inputValue,null);

        final String actualValue = player.getName();

        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void testGetFigure() {
        final Figure inputValue = Figure.X;

        final Figure expectedValue = /*Figure.O*/ inputValue;

        final Player player = new Player(null,inputValue);

        final Figure actualValue = player.getFigure();

        assertEquals(expectedValue,actualValue);
    }
}