package stakeholders;

import org.junit.Before;
import org.junit.Test;
import vehicles.BodyType;
import vehicles.Car;
import vehicles.ElectricCar;
import vehicles.HybridCar;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;
    Car car1;
    Car car2;
    ElectricCar electricCar;
    HybridCar hybridCar;

    @Before
    public void setUp() {
        dealership = new Dealership("Clan Motors", 0);
        car1 = new Car("purple", 1000, BodyType.SUV, 1800);
        car2 = new Car("red", 2000, BodyType.COUPE, 1400);
        electricCar = new ElectricCar("green", 1500, BodyType.SALOON, 60);
        hybridCar = new HybridCar("black", 3000, BodyType.SUV, 240);
    }

    @Test
    public void hasName(){
        assertEquals("Clan Motors", dealership.getCompanyName());
    }

    @Test
    public void hasTill(){
        assertEquals(0, dealership.getTill());
    }

    @Test
    public void hasStock() {
        dealership.addCar(car1);
        dealership.addCar(car2);
        dealership.addCar(electricCar);
        dealership.addCar(hybridCar);
        assertEquals(4, dealership.countStock());
    }
}
