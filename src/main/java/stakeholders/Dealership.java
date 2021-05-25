package stakeholders;

import vehicles.Vehicle;

import java.util.ArrayList;

public class Dealership {

    private String companyName;
    private int till;
    private ArrayList<Vehicle> stock;

    public Dealership(String companyName, int till) {
        this.companyName = companyName;
        this.till = till;
        this.stock = new ArrayList<Vehicle>();
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getTill() {
        return till;
    }

    public ArrayList<Vehicle> getStock() {
        return stock;
    }

    public void addCar(Vehicle vehicle) {
        this.stock.add(vehicle);
    }

    public int countStock(){
        return this.stock.size();
    }
}
