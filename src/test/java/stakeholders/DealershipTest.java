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
    Customer customer;

    @Before
    public void setUp() {
        dealership = new Dealership("Clan Motors", 10000);
        customer = new Customer("Mary", 4000);
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
        assertEquals(10000, dealership.getTill());
    }

    @Test
    public void hasStock() {
        dealership.addCar(car1);
        dealership.addCar(car2);
        dealership.addCar(electricCar);
        dealership.addCar(hybridCar);
        assertEquals(4, dealership.countStock());
    }

    @Test
    public void canRemoveCashFromWallet() {
        dealership.reduceTill(1000);
        assertEquals(9000, dealership.getTill());
    }

    @Test
    public void canBuyCar() {
        dealership.buyCar(car1);
        assertEquals(9000, dealership.getTill());
        assertEquals(1, dealership.countStock());
    }

    @Test
    public void canSellCarToCustomer(){
        dealership.addCar(car1);
        dealership.addCar(car2);
        dealership.makeSale(car1, customer);
        assertEquals(11000, dealership.getTill());
        assertEquals(1, dealership.countStock());
        assertEquals(3000, customer.getWallet());
        assertEquals(1, customer.countCollectionOfVehicles());
    }
}
