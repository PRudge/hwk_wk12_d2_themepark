import Stalls.IceCream;

import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IceCreamTest {
    private IceCream iceCream;
    private Visitor visitor;

    @Before
    public void before() {
        iceCream = new IceCream("Raspberry Ripple", "Pauline", "Bay12");
    }

    @Test
    public void canGetName() {
        assertEquals("Raspberry Ripple", iceCream.getName());

    }

    @Test
    public void canGetOwnerName() {
        assertEquals("Pauline", iceCream.getOwnerName());

    }

    @Test
    public void canGetParkingSpot() {
        assertEquals("Bay12", iceCream.getParkingSpot());

    }

    @Test
    public void getPriceForVisitor(){
        visitor = new Visitor(34,1.30, 15);
        assertEquals(2.8, iceCream.priceForVisitor(visitor), .01);

    }
}
