package Seminar13;

@FunctionalInterface
public interface BMIInterface {
    public abstract BMI createBMI(String name, int age, double weight, double height);
}
