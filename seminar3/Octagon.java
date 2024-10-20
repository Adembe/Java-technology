package seminar3;

public class Octagon extends GeometricObject implements Cloneable{
 private double side;

    public Octagon(double side) {
        this.side = side;
    }

    public Octagon(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }


    @Override /** Override the protected clone method defined in
     25 the Object class, and strengthen its accessibility */
    public Object clone() {
            try {
                return super.clone();
            }
            catch (CloneNotSupportedException ex) {
                return null;
            }
    }


    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return (2+4/Math.sqrt(2))*side*side;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }
}
