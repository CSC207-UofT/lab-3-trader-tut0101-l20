import org.junit.*;

import static org.junit.Assert.*;

public class BearTest {
    Bear b;

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(10, b.getPrice());
    }
}
