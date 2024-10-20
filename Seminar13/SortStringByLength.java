package Seminar13;

import java.util.Arrays;
import java.util.List;

public class SortStringByLength {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Atlanta", "Savannah", "New York","Dallas");
        cities.sort(String::compareToIgnoreCase);
        System.out.println(cities);
    }
}
