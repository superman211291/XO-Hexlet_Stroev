package io.hexlet.xo.model;

import io.hexlet.xo.model.Exceptions.InvalidPointException;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

public class FieldTest {

    @Test
    public void testSetFigure() throws Exception {
        final Field field = new Field();
        final Point point = new Point(0,0);
        final Figure inputFigure = Figure.X;

        field.setFigure(point,inputFigure);
        final Figure actualFigure = field.getFigure(point);

        assertEquals(inputFigure,actualFigure);
    }

    @Test
    public void testGetSIZE() throws Exception {
        final Field field = new Field();

        assertEquals(3,field.getSIZE());
    }

    @Test
    public void testGetFigureWhenFigureIsNotSet() throws Exception {
        final Field field = new Field();
        final Point inputpoint = new Point(0,0);

        final Figure actualFigure = field.getFigure(inputpoint);

        assertNull(actualFigure);
    }

    @Test
    public void testGetFigureWhenXIsLessThenZero() throws Exception {
        final Field field = new Field();
        final Point inputPoint = new Point(-1,0);

        try {
            final Figure actualFigure = field.getFigure(inputPoint);
            fail();
        } catch (final InvalidPointException e) {}
    }

    @Test
    public void testGetFigureWhenXIsMoreThenSize() throws Exception {
        final Field field = new Field();
        final Point inputPoint = new Point(field.getSIZE() + 1,0);

        try {
            final Figure actualFigure = field.getFigure(inputPoint);
            fail();
        } catch (final InvalidPointException e) {}
    }

    @Test
    public void testGetFigureWhenYIsLessThenZero() throws Exception {
        final Field field = new Field();
        final Point inputPoint = new Point(0,-1);

        try {
            final Figure actualFigure = field.getFigure(inputPoint);
            fail();
        } catch (final InvalidPointException e) {}
    }

    @Test
    public void testGetFigureWhenYIsMoreThenSize() throws Exception {
        final Field field = new Field();
        final Point inputPoint = new Point(0,field.getSIZE() + 1);

        try {
            final Figure actualFigure = field.getFigure(inputPoint);
            fail();
        } catch (final InvalidPointException e) {}
    }
}