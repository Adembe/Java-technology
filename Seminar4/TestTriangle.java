package Seminar4;


public class TestTriangle {

    public TestTriangle() throws IllegalTriangleException {
        double s1,s2,s3,area;
        Triangle triangle = new Triangle(2,2,3);
        area = triangle.getArea();
        System.out.printf("Gurwaljni Talbai : %.2f",area);
    }





    public static void main(String[] args) {
        try {
            new TestTriangle();
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }
    }

}
