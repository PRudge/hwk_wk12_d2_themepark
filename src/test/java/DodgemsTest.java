import Attractions.Dodgems;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DodgemsTest {
    private Dodgems dodgems;

    @Before
    public void before() {
        dodgems = new Dodgems("Bumper Cars");
    }

    @Test
    public void canGetName() {
        assertEquals("Bumper Cars", dodgems.getName());

    }
}
