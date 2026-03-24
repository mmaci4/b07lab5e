package lab4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CircleTest {

    @Test
    void testArea() {
        Circle c = new Circle(new Point(0,0), 1);
        assertEquals(Math.PI, c.getArea(), 0.001);
    }

    @Test
    void testPerimeter() {
        Circle c = new Circle(new Point(0,0), 1);
        assertEquals(2 * Math.PI, c.getPerimeter(), 0.001);
    }
}
