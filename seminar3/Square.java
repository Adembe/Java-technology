package seminar3;

public class Square extends GeometricObject implements Colorable{
    private double width, height;

    public Square() {
    }

    public Square(String color, boolean filled) {
        super(color, filled);
    }


    public Square(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Square(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }


    @Override
    public String howToColor() {
        return "Color all four sides";
    }


    @Override
    public double getArea() {
        return width*height;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    public double getWeight() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWeight(double weight) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
