package seminar3;

public class ComparableCircle extends Circle implements Comparable {
    public ComparableCircle() {
    }
    public ComparableCircle(double radius) {
        super(radius);
    }
    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }
    @Override
    public int compareTo(Object o) {
        if(this.getArea()>((ComparableCircle)o).getArea())
            return 1;
        else if(this.getArea()<((ComparableCircle)o).getArea())
            return -1;
        else return 0;
    }
}
