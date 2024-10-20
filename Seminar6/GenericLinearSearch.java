package Seminar6;

public class GenericLinearSearch {


    public GenericLinearSearch() {
        int index1,index2;
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"a", "b","c","d"};
        index1 = linearSearch(intArray,3);
        index2 = linearSearch(stringArray,"a");
        System.out.println(index1);
        System.out.println(index2);
    }

    public static <E extends Comparable<E>> int linearSearch(E[] list, E key){
        for (int i=0; i< list.length; i++){
            if(list[i].compareTo(key) == 0){
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        new GenericLinearSearch();
    }
}
