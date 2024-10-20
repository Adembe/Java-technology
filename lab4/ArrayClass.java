package lab4;

public class ArrayClass {
    private int[] array = new int[5];
    private int size = 0;
    private int len;

    public ArrayClass() {

    }

    public void addNumber(int number1, int number2) {
        if (size == len) {
            incLen();
        }
        try {
            int add = Math.addExact(number1, number2);
            array[size++] = add;
        } catch (ArithmeticException e) {
            System.out.println("Overflow!!!");
        }
    }

    public int at(int index) {
        if (index >= 0 && index < size) {
            return array[index];
        } else {
            System.out.println("Index array-iin hemjeenees hetersen!!");
            return -1;
        }
    }

    private void incLen() {
        int addLen = len + 1;
        int[] newArray = new int[addLen];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
        len = addLen;
    }

    public static void main(String[] args) {
        ArrayClass array = new ArrayClass();
        array.addNumber(5, 10);
        array.addNumber(Integer.MAX_VALUE, 1); // This will trigger overflow
        array.addNumber(15, 20);
        int result = array.at(0);
        System.out.println("Result at index 0: " + result);
        result = array.at(5);
    }
}
