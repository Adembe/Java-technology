package lab2;

public class Route {
    private double id;
    private double startPoint;
    private double endPoint;
    private double len;

    public Route(double id, double startPoint, double endPoint, double len) {
        this.id = id;
        this.startPoint = startPoint;
        this.endPoint = endPoint;
        this.len = len;
    }

    public Route() {
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public double getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(double startPoint) {
        this.startPoint = startPoint;
    }

    public double getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(double endPoint) {
        this.endPoint = endPoint;
    }

    public double getLen() {
        return len;
    }

    public void setLen(double len) {
        this.len = len;
    }
}
