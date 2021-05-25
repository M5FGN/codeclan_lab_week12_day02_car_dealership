package vehicles;

public class Car extends Vehicle {

    private int engineSize;

    public Car(String color, int price, BodyType bodyType, int engineSize) {
        super(color, price, bodyType);
        this.engineSize = engineSize;
    }

    public int getEngineSize() {
        return engineSize;
    }
}
