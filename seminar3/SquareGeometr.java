package seminar3;

public class SquareGeometr {

    public SquareGeometr() {
        Calculate();
    }

    public void Calculate(){
        GeometricObject[] geometricObjects = {
                new Square("red",true,3.0,4.0),
                new Square("red",true,3.0,4.0),
                new Square("red",true,3.0,4.0)};
        for (int i = 0; i < geometricObjects.length; i++) {
            System.out.println("\nSquare #" + (i + 1));
            System.out.println("Area: " + geometricObjects[i].getArea());
            System.out.println("How to color: " + ((Square)geometricObjects[i]).howToColor());
        }
    }

    public static void main(String[] args) {
        new Square();
    }
}