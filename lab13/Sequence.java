package homework14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Sequence {

    public Sequence() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter index of sequence: ");
        int n = scan.nextInt();

        List<Integer> aSequence = generateASequence(n);
        List<Integer> bSequence = generateBSequence(n, aSequence);

        int aNthElement = getNthElement(aSequence, n);
        int bNthElement = getNthElement(bSequence, n);

        System.out.println("A sequence's nth element is: " + aNthElement);
        System.out.println("B sequence's nth element is: " + bNthElement);
    }

    public static List<Integer> generateASequence(int n) {
        List<Integer> aSequence = Arrays.asList(2, 3, 4, 7, 13);
        List<Integer> bSequence = generateBSequence(n, aSequence);

        for (int i = 5; i < n; i++) {
            if(bSequence.size() < i){
                generateBSequence(i, aSequence);
            }
            aSequence.add(bSequence.get(i - 3) + bSequence.get(i - 1));
        }

        return aSequence;
    }

    public static List<Integer> generateBSequence(int n, List<Integer> aSequence) {
        List<Integer> bSequence = new ArrayList<>();
        int i = 1;

        while (bSequence.size() < n) {
            if (!aSequence.contains(i)) {
                bSequence.add(i);
            }
            i++;
        }

        return bSequence;
    }

    public static int getNthElement(List<Integer> sequence, int n) {
        return sequence.get(n - 1);
    }

    public static void main(String[] args) {
        new Sequence();
    }
}
