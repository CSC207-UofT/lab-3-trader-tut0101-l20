import org.junit.Before;

public class KomodoTest {
    KomodoDragon k;

    @Before
    public void setup() throws Exception {
        k = new KomodoDragon();
    }

    @Test(timeout = 50)
    public void TestMaxSpeed() {assertEquals(5, k.getMaxSpeed());}

    @Test(timeout = 50)
    public void TestSpeedUpgrade() {
        k.upgradeSpeed();
        assertEquals(15, k.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestSpeedDowngrade() {
        k.downgradeSpeed();
        assertEquals(10, k.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestPrice() {assertEquals(5000, k.getPrice());}

}
