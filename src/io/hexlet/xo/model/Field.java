package io.hexlet.xo.model;

import java.awt.*;

public class Field {

    private static final int SIZE = 3;

    private static final  int MIN_COORDINATE = 0;

    private static final int MAX_COORDINATE = SIZE;

    private final Figure[][] field = new Figure[SIZE][SIZE];

    public void setFigure(final Point point, final Figure figure) {

        field[point.x][point.y] = figure;
    }

    public int getSIZE() {

        return SIZE;
    }

    public Figure getFigure(final Point point) {

        return field[point.x][point.y];
    }

    private boolean checkPoint(final Point point) {
        return checkCoordinate(point.x) && checkCoordinate(point.y);
    }

    private boolean checkCoordinate(final int coordinate) {
        return coordinate >= MIN_COORDINATE && coordinate <= MAX_COORDINATE;
    }
}
