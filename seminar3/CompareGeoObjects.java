package seminar3;

public class CompareGeoObjects {
    ComparableCircle circle1,  circle2;
    public CompareGeoObjects(){
        circle1=new ComparableCircle(12);
        circle2=new ComparableCircle(12);
        if(circle1.compareTo(circle2)>0)
            System.out.println("circle1");
        else if(circle1.compareTo(circle2)<0)
            System.out.println("circle2");
        else
            System.out.println("circle2==circle1");
    }

    public static void main(String[] args) {
        new CompareGeoObjects();
    }
}
