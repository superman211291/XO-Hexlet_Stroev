package io.hexlet.xo.model;

import io.hexlet.xo.model.Exceptions.AlreadyOccupiedException;
import io.hexlet.xo.model.Exceptions.InvalidPointException;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

public class FieldTest {

    @Test
    public void testSetFigure() throws AlreadyOccupiedException, InvalidPointException {
        final Field field = new Field();
        final Point point = new Point(0,0);
        final Figure inputFigure = Figure.X;

        field.setFigure(point,inputFigure);
        final Figure actualFigure = field.getFigure(point);

        assertEquals(inputFigure,actualFigure);
    }

    @Test
    public void testGetSIZE() {
        final Field field = new Field();

        assertEquals(3,field.getSIZE());
    }
}