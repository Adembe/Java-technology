package Seminar6;

import java.util.ArrayList;
import java.util.List;

public class SumEvenAndOdd {

    public SumEvenAndOdd() {
        ArrayList<Integer> numbers =new ArrayList<>();
        ArrayList<Integer> sumList = new ArrayList<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(12);
        numbers.add(23);
        numbers.add(34);
        numbers.add(51);
        numbers.add(19);
        numbers.add(31);
        numbers.add(18);
        for(int i=0; i < numbers.size(); i++){
            System.out.println(sumList.get(i));
        }
        sumList = sum(numbers);
        for(int i=0; i< sumList.size(); i++){
            System.out.println(sumList.get(i));
        }
    }

    public static <T extends Number> ArrayList<Integer> sum(ArrayList<Integer> list){
        ArrayList<Integer> temp = new ArrayList<>();
        int evenSum = 0,oddSum = 0;
        int i=0;
        while (i<list.size()){
            if(list.get(i) % 2 == 0){
                evenSum+=i;
            }
            else
                oddSum+=i;
            i++;
        }
        temp.add(evenSum);
        temp.add(oddSum);
        return temp;
    }

    public static void main(String[] args) {
        new SumEvenAndOdd();
    }
}
