package vehicles;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Car car;

    @Before
    public void setUp(){
        car = new Car("purple", 1000, BodyType.SUV, 1800);
    }

    @Test
    public void hasColor(){
        assertEquals("purple", car.getColor());
    }

    @Test
    public void hasPrice(){
        assertEquals(1000, car.getPrice(), 0.0);
    }

    @Test
    public void hasBodyType() {
        assertEquals(BodyType.SUV, car.getBodyType());
    }

    @Test
    public void hasEngineSize() {
        assertEquals(1800, car.getEngineSize());
    }
}
