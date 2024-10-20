package Seminar4;

public class Triangle {
    double a,b,c,pre,area;

    public Triangle(double a, double b, double c) throws IllegalTriangleException{
        if(!isValidTriangle(a,b,c)){
            throw new IllegalTriangleException("No create triangle");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() {
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getPre() {
        return (a+b+c)/2;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", pre=" + pre +
                ", area=" + area +
                '}';
    }

    public double getArea() {
        double p = getPre();
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void setPre(double pre) {
        this.pre = pre;
    }

    public void setArea(double area) {
        this.area = area;
    }
    private boolean isValidTriangle(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }
}
