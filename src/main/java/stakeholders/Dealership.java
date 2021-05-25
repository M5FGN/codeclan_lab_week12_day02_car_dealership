package stakeholders;

import vehicles.Car;
import vehicles.Vehicle;

import java.util.ArrayList;

public class Dealership implements IBuy{

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

    public void removeCar(Vehicle vehicle) {
        this.stock.remove(vehicle);
    }

    public int countStock(){
        return this.stock.size();
    }

    public void reduceTill(int amount){
        this.till -= amount;
    }

    public void increaseTill(int amount){
        this.till += amount;
    }

    public void buyCar(Vehicle vehicle) {
        this.addCar(vehicle);
        this.reduceTill(vehicle.getPrice());
    }

    public void makeSale(Vehicle vehicle, Customer customer) {
        this.removeCar(vehicle);
        this.increaseTill(vehicle.getPrice());
        customer.buyCar(vehicle);
    }
}
