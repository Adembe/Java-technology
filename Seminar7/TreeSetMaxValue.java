package Seminar7;

import java.lang.reflect.Array;
import java.util.*;

public class TreeSetMaxValue {
    ArrayList<Integer> path = new ArrayList<>();
    public TreeSetMaxValue() {
        Integer[] numbers = {12,34,6,2,7,9,34,4657,23,98};
        Set<Integer> numbersSet = new TreeSet<>(Arrays.asList(numbers));
        System.out.println(numbersSet);
        while (numbersSet.size()>1){
            int last = ((TreeSet<Integer>) numbersSet).last();
            numbersSet.remove(last);
            int secondLast = ((TreeSet<Integer>) numbersSet).last();
            numbersSet.remove(secondLast);
            path.add(last);
            path.add(secondLast);
            int average = (last+secondLast)/2;
            numbersSet.add(average);
        }
        System.out.println("path: "+path);
        System.out.println("last: "+numbersSet);
    }

    public static void main(String[] args) {
        new TreeSetMaxValue();
    }
}
