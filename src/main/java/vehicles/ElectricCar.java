package vehicles;

public class ElectricCar extends Vehicle{

    private int chargingTime;

    public ElectricCar(String color, int price, BodyType bodyType, int chargingTime) {
        super(color, price, bodyType);
        this.chargingTime = chargingTime;
    }

    public int getChargingTime() {
        return chargingTime;
    }
}
