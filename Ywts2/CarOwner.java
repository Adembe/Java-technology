package Ywts2;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CarOwner {
    public CarOwner() {
        Car car1 = new Car("X6", 2015, "BMW");
        Car car2 = new Car("X3", 2017, "BMW");
        Car car3 = new Car("S500", 2012, "DIMLER");
        Car car4 = new Car("Prius 5", 2016, "TOYOTA");
        Person bold = new Person("Bold Sure", 31, Arrays.asList(car1, car2, car3, car4));
        Person mono = new Person("Mona Yondon", 29);
        Person amar = new Person("Amaraa Denzen", 30, Arrays.asList(car1, car4));

        System.out.println("Niit " + countDifferentCarTypes(Arrays.asList(bold, mono, amar)) + " torliin mashin baina.");
        System.out.println("Hamgiin svvliin uyiin zagwariin mashin ni : " + findLatestCarModel(Arrays.asList(bold, amar)));
        System.out.println("Boldiin ezemshdeg bvh mashin : " + findCarsOwnedByPerson(bold));
    }

    public static int countDifferentCarTypes(List<Person> persons) {
        Set<String> carTypes = persons.stream()
                .flatMap(person -> person.getCars().stream())
                .map(Car::getModel)
                .collect(Collectors.toSet());
        return carTypes.size();
    }

    public static String findLatestCarModel(List<Person> persons) {
        return persons.stream()
                .flatMap(person -> person.getCars().stream())
                .max(java.util.Comparator.comparingInt(Car::getProductionYear))
                .map(Car::getModel)
                .orElse("");
    }

    public static List<String> findCarsOwnedByPerson(Person person) {
        return person.getCars()
                .stream()
                .map(Car::getModel)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        new CarOwner();
    }
}
