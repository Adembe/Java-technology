package Seminar7;

import java.util.*;

public class IteratorUsing {
    public static LinkedList<Integer> collections;
    public IteratorUsing() {
        collections = new LinkedList<Integer>();
        collections.add(123);
        collections.add(111);
        collections.add(11);
        collections.add(53);
        collections.add(12);
        collections.add(3);
        collections.add(13);
        Iterator<Integer> iterator = collections.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        Collections.sort(collections);
        System.out.println("Sort: "+collections);
        Collections.shuffle(collections);
        System.out.println("Shuffle: "+collections);
        Collections.reverse(collections);
        System.out.println("Reverse: "+collections);
    }


    public static void main(String[] args) {
        new IteratorUsing();
    }
}
