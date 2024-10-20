package lab5;

import java.io.Serializable;

public class Cube implements Serializable {
    private double length;
    private String color;
    private String material;

    public Cube(double length, String color, String material) {
        this.length = length;
        this.color = color;
        this.material = material;
    }

    public double getLength() {
        return length;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return "Cube{" +
                "length=" + length +
                ", color='" + color + '\'' +
                ", material='" + material + '\'' +
                '}';
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
