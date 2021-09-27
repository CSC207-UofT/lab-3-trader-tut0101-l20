import org.junit.*;

import static org.junit.Assert.*;
public class ElephantTest {
    Elephant e;
    @Before
    public void startup() throws Exception{
        e = new Elephant();
    }
    @Test(timeout = 50)
    public void TestElephantPrice(){
        assertEquals(10, e.getPrice());
    }
    @Test(timeout = 50)
    public void TestInitialElephantSpeed(){
        assertEquals(2, e.getMaxSpeed());
    }
    @Test(timeout = 50)
    public void TestElephantSpeedIncrease(){
        e.upgradeSpeed();
        assertEquals(4, e.getMaxSpeed());
    }
    @Test(timeout = 50)
    public void TestElephantSpeedDecrease(){
        e.downgradeSpeed();
        assertEquals(0, e.getMaxSpeed());
    }
}
