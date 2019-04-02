import Stalls.TobaccoStall;

import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {
    private TobaccoStall tobaccoStall;
    private Visitor visitor;

    @Before
    public void before() {
        tobaccoStall = new TobaccoStall("Lucky Strike", "Daniel", "Bay10");
    }

    @Test
    public void canGetName() {
        assertEquals("Lucky Strike", tobaccoStall.getName());

    }

    @Test
    public void canGetOwnerName() {
        assertEquals("Daniel", tobaccoStall.getOwnerName());

    }

    @Test
    public void canGetParkingSpot() {
        assertEquals("Bay10", tobaccoStall.getParkingSpot());

    }

    @Test
    public void getPriceForVisitor(){
        visitor = new Visitor(34,1.30, 15);
        assertEquals(6.60, tobaccoStall.priceForVisitor(visitor), .01);

    }
}