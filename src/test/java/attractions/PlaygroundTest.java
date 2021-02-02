package attractions;

import behaviours.ISecurity;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class PlaygroundTest  {
    Playground playground;
    Visitor visitor;
    Visitor visitor1;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
        visitor = new Visitor(16, 133, 100);
        visitor1 = new Visitor(10, 100,10 );
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }


    @Test
    public void isAllowed(){
        assertTrue(playground.isAllowedTo(visitor1));
    }

    @Test
    public void isNotAllowed(){
        assertFalse(playground.isAllowedTo(visitor));
    }
}


