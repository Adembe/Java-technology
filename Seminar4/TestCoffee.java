package Seminar4;

import javax.swing.plaf.synth.SynthTabbedPaneUI;

public class TestCoffee {
    public TestCoffee() throws IllegalCoffeeException {
        Coffee coffee = new Coffee(45);
    }



    public static void main(String[] args) {
        try {
            new TestCoffee();
        } catch (IllegalCoffeeException e) {
            throw new RuntimeException(e);
        }
    }
}
