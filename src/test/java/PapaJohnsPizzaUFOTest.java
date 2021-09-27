/*
 * This file contains sample JUnit test cases for Horse.java
 * You should NOT modify this file!
 */

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PapaJohnsPizzaUFOTest {
    PapaJohnsPizzaUFO ufo;

    @Before
    public void setUp() throws Exception {
        ufo = new PapaJohnsPizzaUFO();
    }
    
    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(0, ufo.getMaxSpeed());
    }
    
    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        ufo.upgradeSpeed();
        assertEquals(42069, ufo.getMaxSpeed());
    }
    
    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        ufo.downgradeSpeed();
        assertEquals(-1337, ufo.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(-6969, ufo.getPrice());
    }

}