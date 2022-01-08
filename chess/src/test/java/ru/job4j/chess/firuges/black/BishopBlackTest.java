package ru.job4j.chess.firuges.black;

import junit.framework.TestCase;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import javax.swing.text.Position;

public class BishopBlackTest extends TestCase {

    @Test
    public void whenTestPosition() {
        BishopBlack bishopBlack = new BishopBlack(Cell.B8);
        Cell expected = bishopBlack.position();
        Cell actual = Cell.B8;
        assertEquals(expected, actual);

    }

    @Test
    public void whenTestCopy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Figure expected = bishopBlack.copy(Cell.A1);
        Cell actual = expected.position();
        assertEquals(expected, actual);
    }

    @Test
    public void whenTestWay() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] actual = bishopBlack.way(Cell.G5);
        Cell[] expected = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertEquals(expected, actual);
    }
}