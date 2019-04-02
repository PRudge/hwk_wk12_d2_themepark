import ThemePark.Visitor;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class VisitorTest {
    private Visitor visitor;

    @Before
    public void before(){
        visitor = new Visitor(34,1.64, 56.00);
    }

    @Test
    public void canGetAge() {
        assertEquals(34, visitor.getAge());
    }

    @Test
    public void canGetHeight() {
        assertEquals(1.64, visitor.getHeightInMeters(), 2);
    }

    @Test
    public void canGetMoney() {
        assertEquals(56.00, visitor.getMoney(), 2);
    }

    @Test
    public void getPriceForVisitor(){
        assertEquals(10.00, visitor.priceForVisitor(visitor), 2);
    }
    @Test
    public void getPriceForVisitorAge4(){
        visitor = new Visitor(4,.83, 16.00);
        assertEquals(1.00, visitor.priceForVisitor(visitor), 2);
    }

    @Test
    public void getPriceForVisitorAge64(){
        visitor = new Visitor(64,1.90, 56.00);
        assertEquals(6.00, visitor.priceForVisitor(visitor), 2);
    }
}

