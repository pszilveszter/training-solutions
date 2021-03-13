package week15d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    void testGetMostInvolved() {
        Game game = new Game();
        House result = game.getMostInvolved(this.getClass().getResourceAsStream("battles.csv"));
        assertEquals("Lannister", result.getName());
        assertEquals(18, result.getBattles().size());
        assertEquals("Blackwood", result.getBattles().get(17).getDefenders().get(0).getName());
    }

}