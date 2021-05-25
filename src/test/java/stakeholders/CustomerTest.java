package stakeholders;

import org.junit.Before;
import org.junit.Test;
import vehicles.BodyType;
import vehicles.Car;
import vehicles.ElectricCar;
import vehicles.HybridCar;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Car car1;
    Car car2;
    ElectricCar electricCar;
    HybridCar hybridCar;

    @Before
    public void setUp() {
        customer = new Customer("Mary", 4000);
        car1 = new Car("purple", 1000, BodyType.SUV, 1800);
        car2 = new Car("red", 2000, BodyType.COUPE, 1400);
        electricCar = new ElectricCar("green", 1500, BodyType.SALOON, 60);
        hybridCar = new HybridCar("black", 3000, BodyType.SUV, 240);

    }

    @Test
    public void hasName() {
        assertEquals("Mary", customer.getName());
    }

    @Test
    public void hasWallet() {
        assertEquals(4000, customer.getWallet());
    }

    @Test
    public void hasCollectionOfVehicles() {
        customer.addCar(car1);
        customer.addCar(car2);
        customer.addCar(electricCar);
        customer.addCar(hybridCar);
        assertEquals(4, customer.countCollectionOfVehicles());
    }

    @Test
    public void canRemoveCashFromWallet() {
        customer.reduceWallet(100);
        assertEquals(3900, customer.getWallet());
    }

    @Test
    public void canBuyCar() {
    customer.buyCar(car1);
    assertEquals(3000, customer.getWallet());
    assertEquals(1, customer.countCollectionOfVehicles());
    }
}
