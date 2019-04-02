import Attractions.RollerCoaster;

import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RollerCoasterTest {
    private RollerCoaster rollerCoaster;
    private Visitor visitor;

    @Before
    public void before() {
        rollerCoaster = new RollerCoaster("Banshee");
    }

    @Test
    public void canGetName() {
        assertEquals("Banshee", rollerCoaster.getName());

    }

    @Test
    public void isAllowedAVisitorYes(){
        visitor = new Visitor(34, 1.54, 15);
        assertEquals(true, rollerCoaster.IsAllowed(visitor));
    }

    @Test
    public void isAllowedAVisitorTooYoung(){
        visitor = new Visitor(11, 1.54, 15);
        assertEquals(false, rollerCoaster.IsAllowed(visitor));
    }

    @Test
    public void isAllowedAVisitorTooSmall(){
        visitor = new Visitor(34,1.30, 15);
        assertEquals(false, rollerCoaster.IsAllowed(visitor));
    }

    @Test
    public void getPriceForVisitor(){
        visitor = new Visitor(34,1.30, 15);
        assertEquals(10.00, visitor.priceForVisitor(visitor), 2);

    }

    @Test
    public void doublesFeeForOver2m(){
        visitor = new Visitor(34,2.30, 15);
        assertEquals(20.00, rollerCoaster.priceForVisitor(visitor), 2);
    }
}





