package stakeholders;

import vehicles.Vehicle;

import java.util.ArrayList;

public class Customer {

    private String name;
    private int wallet;
    private ArrayList<Vehicle> collectionOfVehicles;

    public Customer(String name, int wallet) {
        this.name = name;
        this.wallet = wallet;
        this.collectionOfVehicles = new ArrayList<Vehicle>();
    }

    public String getName() {
        return name;
    }

    public int getWallet() {
        return wallet;
    }

    public ArrayList<Vehicle> getCollectionOfVehicles() {
        return collectionOfVehicles;
    }

    public void addCar(Vehicle vehicle) {
        this.collectionOfVehicles.add(vehicle);
    }

    public int countCollectionOfVehicles(){
        return this.collectionOfVehicles.size();
    }

}
