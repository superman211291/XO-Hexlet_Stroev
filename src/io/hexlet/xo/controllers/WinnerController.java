package io.hexlet.xo.controllers;

import io.hexlet.xo.model.Exceptions.InvalidPointException;
import io.hexlet.xo.model.Field;
import io.hexlet.xo.model.Figure;

import java.awt.*;

public class WinnerController {

    private final static int COUNT_WIN = 3;

    public Figure getWinner(final Field field) throws InvalidPointException {
        Figure[] figures = new Figure[4];
        figures[0] = checkLine(field);
        figures[1] = checkRow(field);
        figures[2] = checkDiag1(field);
        figures[3] = checkDiag2(field);

        for (Figure figure:figures) {
            if(figure!=null){
                return figure;
            }
        }
        return null;
    }

    private Figure checkLine (final Field field) throws InvalidPointException {

        Figure figure  = null;

        for (int line = 0; line < field.getSIZE(); line++) {
            for (int i = 0; i < field.getSIZE() - 1; i++) {

                figure = field.getFigure(new Point(line, i));

                if ((figure == null) || (figure != field.getFigure(new Point(line, i++)))) {
                    return null;
                }
            }
        }
        return figure;
    }
    private Figure checkRow (final Field field) throws InvalidPointException {

        Figure figure  = null;

        for(int row = 0; row<field.getSIZE(); row++) {
            for (int i = 0; i < field.getSIZE() - 1; i++) {

                figure = field.getFigure(new Point(i, row));

                if ((figure == null) || (figure != field.getFigure(new Point(i++, row)))) {
                    return null;
                }
            }
        }
        return figure;
    }

    private Figure checkDiag1 (final Field field) throws InvalidPointException {

        Figure figure1 = null;

        for(int i = 0; i < field.getSIZE()-1; i++) {
            figure1 = field.getFigure(new Point(i,i));

            if((figure1 == null) || (figure1 != field.getFigure(new Point(i++,i++)))) {
                return null;
            }
        }
        return figure1;
    }
    private Figure checkDiag2 (final Field field) throws InvalidPointException {

        Figure figure2 = null;


        for(int i = 0; i < field.getSIZE()-1; i++) {
            figure2 = field.getFigure(new Point(i,i));

            if((figure2 == null) || (figure2 != field.getFigure(new Point(field.getSIZE()-i-1,i)))) {
                return null;
            }
        }
        return figure2;
    }
}
