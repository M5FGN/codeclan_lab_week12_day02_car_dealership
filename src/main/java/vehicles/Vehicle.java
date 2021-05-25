package vehicles;

import com.sun.xml.internal.ws.wsdl.writer.document.soap.Body;

public abstract class Vehicle {

    private String color;
    private int price;
    private BodyType bodyType;

    public Vehicle(String color, int price, BodyType bodyType) {
        this.color = color;
        this.price = price;
        this.bodyType = bodyType;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public BodyType getBodyType() {
        return bodyType;
    }
}
