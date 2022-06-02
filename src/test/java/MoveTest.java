import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoveTest {

    @Test
    void shouldReturnMovementsInSquares() {
        Move move = new Move();
        move.setMovement(6);

        assertEquals(6, move.getMovement());
    }

    @Test
    void shouldReturnMovementsInMeters() {
        Move move = new Move();
        move.setMovement(6);

        assertEquals(9.0f, move.getMeter());
    }

}
