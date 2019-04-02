import Attractions.PlayGround;

import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PlayGroundTest {
    private PlayGround playGround;
    private Visitor visitor;

    @Before
    public void before() {
        playGround = new PlayGround("Clouds");
    }

    @Test
    public void canGetName() {
        assertEquals("Clouds", playGround.getName());

    }

    @Test
    public void isAllowedAVisitorYes(){
        visitor = new Visitor(34, 1.54, 15);
        assertEquals(true, playGround.IsAllowed(visitor));
    }

    @Test
    public void isAllowedAVisitorNoTooYoung(){
        visitor = new Visitor(14, 1.54, 15);
        assertEquals(false, playGround.IsAllowed(visitor));
    }
}

