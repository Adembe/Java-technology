package Seminar4;

import java.awt.*;

public class Coffee {
    double gradius;

    public Coffee(double gradius) throws IllegalCoffeeException{
        if(!isCheckCoffee(gradius))
            throw new IllegalCoffeeException("Uuh bolomjgvi baina");
        this.gradius = gradius;
    }

    public void setGradius(double gradius)  {


        this.gradius = gradius;
    }

    public double getGradius() {
        return gradius;
    }

    public boolean isCheckCoffee(double gradius){
        if(gradius < 70 && gradius > 0)
            return true;
        else return false;
    }
}
