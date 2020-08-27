package io.hexlet.xo.model;

import io.hexlet.xo.model.Exceptions.AlreadyOccupiedException;
import io.hexlet.xo.model.Exceptions.InvalidPointException;

import java.awt.*;

public class Field {

    private static final int SIZE = 3;

    private static final  int MIN_COORDINATE = 0;

    private static final int MAX_COORDINATE = SIZE;

    private final Figure[][] field = new Figure[SIZE][SIZE];

    public void setFigure(final Point point, final Figure figure) throws    InvalidPointException,
                                                                            AlreadyOccupiedException {
        if(!checkPoint(point)) {
            throw new InvalidPointException();
        }
        if(field[point.x][point.y] != null) {
            throw new AlreadyOccupiedException();
        }

        field[point.x][point.y] = figure;
    }

    public int getSIZE() {

        return SIZE;
    }

    public Figure getFigure(final Point point) throws InvalidPointException {
        if(!checkPoint(point)) {
            throw new InvalidPointException();
        }

        return field[point.x][point.y];
    }

    private boolean checkPoint(final Point point) {
        return checkCoordinate(point.x) && checkCoordinate(point.y);
    }

    private boolean checkCoordinate(final int coordinate) {
        return coordinate >= MIN_COORDINATE && coordinate <= MAX_COORDINATE;
    }
}
