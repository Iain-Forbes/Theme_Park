package attractions;

import behaviours.ITicketed;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor;
    Visitor visitor1;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor = new Visitor(16, 250, 100);
        visitor1 = new Visitor(10, 100, 10);
    }


    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void isAllowedTo() {
    assertTrue(rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void isNotAllowedTo() {
        assertFalse(rollerCoaster.isAllowedTo(visitor1));
    }

    @Test
    public void defaultPrice() {
    assertEquals(8.50, rollerCoaster.defaultPrice(),0.00);
    }

    @Test
    public void priceFor() {
    assertEquals(17, rollerCoaster.priceFor(visitor), 0.00);
    }
}
