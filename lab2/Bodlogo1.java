package lab2;

import java.util.ArrayList;
import java.util.Collections;

public class Bodlogo1 {

    public Bodlogo1() {
        maxLenRoute();
        sortRoute();
    }

    public Route[] createDirection(){
        Route[] allRoute = {
                new Route(1021, 0.1,2.4,2.3),
                new Route(1002, 0.5,2.4,1.9),
                new Route(1013, 0.3,1.4,1.1),
                new Route(1004, 1.1,2.2,1.1),
                new Route(1005, 1.0,2.9,1.9),
                new Route(1060, 0.0,9.4,9.4),
                new Route(1007, 2.1,5.4,3.3),
                new Route(1008, 0.7,1.4,0.7),
                new Route(1009, 1.5,2.4,0.9),
                new Route(1010, 11.1,22.4,11.3),
        };
        return allRoute;
    }
    public void maxLenRoute(){
        Route routes[] = createDirection();
        double max = routes[0].getLen();
        for (int i=0; i< routes.length; i++){
            if(routes[i].getLen() > max)
                max = routes[i].getLen();
        }
        System.out.printf("Hamgiin urt route : %.2f\n",max);
    }
    public void sortRoute(){
        Route routes[] = createDirection();
        ArrayList<Double> directionId = new ArrayList<>();
        for (int i=0; i<routes.length; i++){
            directionId.add(routes[i].getId());
        }
        Collections.sort(directionId);
        System.out.print("Sort Route Id: ");
        for (int i=0; i<directionId.size(); i++){
            System.out.print(" "+directionId.get(i));
        }
    }

    public static void main(String[] args) {
        new Bodlogo1();
    }
}
