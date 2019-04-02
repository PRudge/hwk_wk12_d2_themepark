import Stalls.CandyFlossStall;

import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CandyFlossStallTest {
    private CandyFlossStall candyFlossStall;
    private Visitor visitor;

    @Before
    public void before() {
        candyFlossStall = new CandyFlossStall("Fluffy Valley", "Brogan", "Bay9");
    }

    @Test
    public void canGetName() {
        assertEquals("Fluffy Valley", candyFlossStall.getName());

    }

    @Test
    public void canGetOwnerName() {
        assertEquals("Brogan", candyFlossStall.getOwnerName());

    }

    @Test
    public void canGetParkingSpot() {
        assertEquals("Bay9", candyFlossStall.getParkingSpot());

    }

    @Test
    public void getPriceForVisitor(){
        visitor = new Visitor(34,1.30, 15);
        assertEquals(4.20, candyFlossStall.priceForVisitor(visitor), 2);

    }
}
