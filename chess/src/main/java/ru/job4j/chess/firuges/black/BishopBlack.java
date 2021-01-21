package ru.job4j.chess.firuges.black;

import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

public class BishopBlack implements Figure {
    private final Cell position;

    public BishopBlack(final Cell ps) {
        position = ps;
    }

    @Override
    public Cell position() {
        return position;
    }

    @Override
    public Cell[] way(Cell dest) {
        if (!isDiagonal(position, dest)) {
            throw new ImpossibleMoveException(
                    String.format("Could not way by diagonal from %s to %s", position, dest)
            );
        }

        int size = Math.abs(dest.getX() - position.getX());

        Cell[] steps = new Cell[size];
        int deltaX = dest.getX() - position.getX();
        int deltaY = dest.getY() - position.getY();
        System.out.println("deltaX " + dest.getX() + " - " + position.getX() + " = " + (dest.getX() - position.getX()));
        System.out.println("deltaY " + dest.getY() + " - " + position.getY() + " = " + (dest.getY() - position.getY()));

        for (int index = 0; index < size; index++) {
            steps[index] = Cell.findBy(index + deltaX, index + deltaY);
            System.out.println("index " + index + " x- " + (index + deltaX) + " y- " + (index + deltaY));
        }

        return steps;
    }

    public boolean isDiagonal(Cell source, Cell dest) {
        return Math.abs(dest.getX() - source.getX()) == Math.abs(dest.getY() - source.getY());
    }

    @Override
    public Figure copy(Cell dest) {
        return new BishopBlack(dest);
    }
}
