package Seminar13;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestIterator {
    public static void main(String[] args) {
        Collection<String> collections = Arrays.asList("NewYork", "Atlanta","Dallas","Madison");
        collections.stream()
                .skip(0)
                .forEach(s -> System.out.println(s));
    }
}
