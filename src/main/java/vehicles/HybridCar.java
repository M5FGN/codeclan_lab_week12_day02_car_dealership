package vehicles;

public class HybridCar extends Vehicle {

    private int driveTimeOnBattery;

    public HybridCar(String color, double price, BodyType bodyType, int driveTimeOnBattery) {
        super(color, price, bodyType);
        this.driveTimeOnBattery = driveTimeOnBattery;
    }

    public int getDriveTimeOnBattery() {
        return driveTimeOnBattery;
    }

}
