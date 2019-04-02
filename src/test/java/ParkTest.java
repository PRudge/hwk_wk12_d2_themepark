import Attractions.Park;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ParkTest {
    private Park park;

    @Before
    public void before() {
        park = new Park("Fantasy Island");
    }

    @Test
    public void canGetName() {
        assertEquals("Fantasy Island", park.getName());

    }
}

