package Seminar7;

import java.util.TreeSet;

public class TreeSetRemoveLastElement {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();

        // Adding elements to the TreeSet
        treeSet.add("apple");
        treeSet.add("banana");
        treeSet.add("cherry");
        treeSet.add("date");

        System.out.println("Original TreeSet: " + treeSet);

        // Get the last element
        String lastElement = treeSet.last();

        // Remove the last element
        treeSet.remove(lastElement);

        // Calculate the length difference
        int originalLength = lastElement.length();
        System.out.println("originalLength: " + originalLength);
        int newLength = treeSet.last().length();
        System.out.println("newLength: " + newLength);
        int lengthDifference = originalLength - newLength;

        System.out.println("Last Element Removed: " + lastElement);
        System.out.println("Length Difference: " + lengthDifference);
        System.out.println("Updated TreeSet: " + treeSet);
    }
}
