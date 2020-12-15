package week08d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RobotTest {

    @Test
    void testCreate() {
        Exception exNull = assertThrows(IllegalArgumentException.class, ()-> new Robot(null, new Coordinates(0,0)));
        assertEquals("Name is compulsory",exNull.getMessage());

        Exception exEmpty = assertThrows(IllegalArgumentException.class, ()-> new Robot("   ", new Coordinates(0, 0)));
        assertEquals("Name is compulsory", exEmpty.getMessage());

        Robot robot = new Robot("mikrobi", new Coordinates(0, 0));
        assertEquals("mikrobi", robot.getName());
        assertEquals(0, robot.getCords().getX());
        assertEquals(0, robot.getCords().getY());
    }

    @Test
    void testMove() {
        Robot robot = new Robot("mikrobi", new Coordinates(0, 0));
        Exception ex = assertThrows(IllegalArgumentException.class, ()-> robot.move("FFFFLLJFFELJJBBBFJJ"));
        assertEquals("Invalid command found", ex.getMessage());
        assertEquals(0, robot.getCords().getX());
        assertEquals(0, robot.getCords().getY());

        Coordinates chordAfterMove = robot.move("FFFFLLJFFLJJBBBFJJ");
        assertEquals(2, robot.getCords().getX());
        assertEquals(4, robot.getCords().getY());

    }

}