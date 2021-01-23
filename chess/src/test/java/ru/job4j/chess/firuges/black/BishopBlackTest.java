package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void position() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
        assertThat(bishopBlack.position(), is(Cell.A1));
    }

    @Test
    public void copy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
        assertThat(bishopBlack.copy(Cell.D4).position(), is(Cell.D4));
    }

    @Test
    public void wey() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C8);
        Cell[] rsl = new Cell[] {Cell.C8, Cell.D7, Cell.E6, Cell.F5};
        assertThat(bishopBlack.way(Cell.F5), is(rsl));
    }

    @Test
    public void weyLeftUp() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
        Cell[] rsl = new Cell[] {Cell.A1, Cell.B2, Cell.C3, Cell.D4};
        assertThat(bishopBlack.way(Cell.D4), is(rsl));
    }

    @Test(expected = ImpossibleMoveException.class)
    public void weyException() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        bishopBlack.way(Cell.C2);
    }
}
