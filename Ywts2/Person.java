package Ywts2;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private int age;
    private List<Car> cars;

    public Person(String name, int age, List<Car> cars) {
        this.name = name;
        this.age = age;
        this.cars = cars;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.cars = new ArrayList<>(); // Initialize cars with an empty list
    }

    public List<Car> getCars() {
        if (cars == null) {
            cars = new ArrayList<>();
        }
        return cars;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
}
