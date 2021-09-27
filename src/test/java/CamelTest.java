import org.junit.*;

import static org.junit.Assert.*;


public class CamelTest {
    Camel c;

    @Before
    public void setUp() throws Exception {
        c = new Camel();
    }

    @Test(timeout = 1000)
    public void TestGetMaxSpeed() {
        assertEquals(2, c.getMaxSpeed());
    }

    @Test(timeout = 1000)
    public void TestUpgradeSpeed() {
        c.upgradeSpeed();
        assertEquals(3, c.getMaxSpeed());
    }

    @Test(timeout = 1000)
    public void TestDowngradeSpeed() {
        c.downgradeSpeed();
        assertEquals(1, c.getMaxSpeed());
    }

    @Test(timeout = 1000)
    public void TestGetPrice() {
        assertEquals(30, c.getPrice());
    }

}