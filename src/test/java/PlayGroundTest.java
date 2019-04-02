import Attractions.PlayGround;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PlayGroundTest {
    private PlayGround playGround;

    @Before
    public void before() {
        playGround = new PlayGround("Clouds");
    }

    @Test
    public void canGetName() {
        assertEquals("Clouds", playGround.getName());

    }
}

