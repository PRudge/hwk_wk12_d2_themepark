import Attractions.Dodgems;

import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DodgemsTest {
    private Dodgems dodgems;
    private Visitor visitor;

    @Before
    public void before() {
        dodgems = new Dodgems("Bumper Cars");
    }

    @Test
    public void canGetName() {
        assertEquals("Bumper Cars", dodgems.getName());

    }

    @Test
    public void getPriceForVisitor(){
        visitor = new Visitor(34,1.30, 15);
        assertEquals(10.00, dodgems.priceForVisitor(visitor), 2);

    }

    @Test
    public void halvesFeeUnder12(){
        visitor = new Visitor(11,2.30, 15);
        assertEquals(5.00, dodgems.priceForVisitor(visitor), 2);
    }
}
