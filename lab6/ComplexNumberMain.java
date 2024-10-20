package lab6;

public class ComplexNumberMain {

    public ComplexNumberMain() {
        ComplexNumber<Integer> integerNumber1 = new ComplexNumber<>(3, 4);
        ComplexNumber<Integer> integerNumber2 = new ComplexNumber<>(1, 2);

        ComplexNumber<Integer> sum = integerNumber1.add(integerNumber2);
        ComplexNumber<Integer> sub = integerNumber1.subtract(integerNumber2);
        System.out.print("Too 1: ");
        integerNumber1.printValues();
        System.out.print("Too 2: ");
        integerNumber2.printValues();
        System.out.print("Niilber:  ");
        sum.printValues();
        System.out.print("Ylgawar: ");
        sub.printValues();
    }

    public static void main(String[] args) {
        new ComplexNumberMain();
    }
}
