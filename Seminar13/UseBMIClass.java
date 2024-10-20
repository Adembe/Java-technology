package Seminar13;

import java.util.function.Supplier;

public class UseBMIClass {
    public static void main(String[] args) {
        BMIInterface bmiInterface = BMI::new;
        BMI bmi1 = bmiInterface.createBMI("Bold",15,125,45);
        BMI bmi2 = bmiInterface.createBMI("Bat",15,45,789);
        printBMI(bmi1,BMI::getBMI,BMI::getStatus);
        printBMI(bmi2, BMI::getBMI, BMI::getStatus);
    }
    private static void printBMI(BMI bmi, Supplier<Double> bmiSupplier, Supplier<String> statusSupplier) {
        System.out.println("The BMI for " + bmi.getName() + " is " + bmiSupplier.get() + " " + statusSupplier.get());
    }
}
