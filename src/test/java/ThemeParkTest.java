import attractions.Attraction;
import attractions.Dodgems;
import org.junit.Before;
import org.junit.Test;
import stalls.CandyflossStall;
import stalls.ParkingSpot;
import behaviours.IReviewed;


import java.util.ArrayList;

import static org.junit.Assert.*;

public class ThemeParkTest {


    Dodgems dodgems;


    @Before
    public void setUp() {
        dodgems = new Dodgems("Dodgems", 3);
        ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(dodgems);
    }

//    @Test
//    public void canGetAllReviewed() {
//        assertEquals(3, dodgems.().size());
//    }
    }
