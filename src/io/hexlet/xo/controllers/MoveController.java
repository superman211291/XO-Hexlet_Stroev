package io.hexlet.xo.controllers;

import io.hexlet.xo.model.Exceptions.AlreadyOccupiedException;
import io.hexlet.xo.model.Exceptions.InvalidPointException;
import io.hexlet.xo.model.Field;
import io.hexlet.xo.model.Figure;

import java.awt.*;

public class MoveController {

    public void applyFigure(final Field field,
                            final Point point,
                            final Figure figure) throws InvalidPointException,
                                                        AlreadyOccupiedException {
        if(field.getFigure(point) != null) {
            throw new AlreadyOccupiedException();
        } else {
            field.setFigure(point,figure);
        }

    }
}
