package vehicles;

import com.sun.xml.internal.ws.wsdl.writer.document.soap.Body;

public abstract class Vehicle {

    private String color;
    private double price;
    private BodyType bodyType;

    public Vehicle(String color, double price, BodyType bodyType) {
        this.color = color;
        this.price = price;
        this.bodyType = bodyType;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public BodyType getBodyType() {
        return bodyType;
    }
}
