package lab11;

import java.util.Arrays;
import java.util.Comparator;

interface ArraySorting extends Comparator<String[]> {
    @Override
    int compare(String[] array1, String[] array2);
}

public class ArraySortingFPorLambdaUsing {


    ArraySorting arraySorting;
    public ArraySortingFPorLambdaUsing() {
        String[] array1 = {"hello", "spoon", "cat"};
        String[] array2 = {"I", "love", "to", "music"};
        String[] array3 = {"world", "job", "july", "ice", "cold"};

        ArraySorting sortByWordCount = (arr1, arr2) -> Integer.compare(arr1.length, arr2.length);
        sortByWordAndPrint("Agiilj bui vgiin toogoor osohoor erembelsen:", sortByWordCount, array1, array2, array3);

        ArraySorting sortByTotalLetters = (arr1, arr2) -> Long.compare(getTotalLetters(arr1), getTotalLetters(arr2));
        sortByCharAndPrint("Dotorh vsgiih ni toogoor erembelsen :", sortByTotalLetters, array1, array2, array3);
    }
    private static void sortByCharAndPrint(String message, ArraySorting arraySorting, String[]... arrays) {
        Arrays.sort(arrays, arraySorting);

        System.out.println(message);
        for (String[] array : arrays) {
            System.out.println(getTotalLetters(array));
        }
        System.out.println();
    }
    private static void sortByWordAndPrint(String message, ArraySorting arraySorting, String[]... arrays) {
        Arrays.sort(arrays, arraySorting);

        System.out.println(message);
        for (String[] array : arrays) {
            System.out.println(Arrays.toString(array));
        }
        System.out.println();
    }

    private static Long getTotalLetters(String[] array) {
        return Arrays.stream(array)
                .mapToLong(String::length)
                .sum();
    }

    public static void main(String[] args) {
        new ArraySortingFPorLambdaUsing();
    }


}
