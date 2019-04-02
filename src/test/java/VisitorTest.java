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


}

