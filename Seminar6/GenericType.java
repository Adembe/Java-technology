package Seminar6;

import java.util.ArrayList;

public class GenericType {

    ArrayList<Integer> disList = new ArrayList<>();
    ArrayList<Integer> resList = new ArrayList<>();
    public GenericType() {
        disList.add(1);
        disList.add(2);
        disList.add(3);
        disList.add(1);
        disList.add(1);
        resList = removeDuplicates(disList);
        System.out.println(resList);
    }

    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list){
        ArrayList<E> temp = new ArrayList<>();
        int i=0;
        while (i<list.size()){
            if(!temp.contains(list.get(i))){
                temp.add(list.get(i));
            }
            i++;
        }
        return temp;
    }

    public static void main(String[] args) {
        new GenericType();
    }
}
