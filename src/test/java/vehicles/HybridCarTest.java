package vehicles;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HybridCarTest {

    HybridCar hybridCar;

    @Before
    public void setUp(){
        hybridCar = new HybridCar("black", 3000, BodyType.SUV, 240);
    }

    @Test
    public void hasColor(){
        assertEquals("black", hybridCar.getColor());
    }

    @Test
    public void hasPrice(){
        assertEquals(3000, hybridCar.getPrice(), 0.0);
    }

    @Test
    public void hasBodyType() {
        assertEquals(BodyType.SUV, hybridCar.getBodyType());
    }

    @Test
    public void hasDriveTimeOnBattery() {
        assertEquals(240, hybridCar.getDriveTimeOnBattery());
    }
}
