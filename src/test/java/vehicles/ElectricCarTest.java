package vehicles;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {

    ElectricCar electricCar;

    @Before
    public void setUp(){
        electricCar = new ElectricCar("green", 1500, BodyType.SALOON, 60);
    }

    @Test
    public void hasColor(){
        assertEquals("green", electricCar.getColor());
    }

    @Test
    public void hasPrice(){
        assertEquals(1500, electricCar.getPrice(), 0.0);
    }

    @Test
    public void hasBodyType() {
        assertEquals(BodyType.SALOON, electricCar.getBodyType());
    }

    @Test
    public void hasChargingTime() {
        assertEquals(60, electricCar.getChargingTime());
    }
}
