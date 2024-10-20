package lab3;

public class AnimalMain {
    public AnimalMain() {
        Dog dog = new Dog("Diggy","how how how", 4);
        Cat cat = new Cat("Gomu", "miaw miaw miaw", 4);
        Parrot parrot = new Parrot("Zegzag", "hvnii yria dagadag", 2);

        dog.displayCharacteristics();
        cat.displayCharacteristics();
        parrot.displayCharacteristics();
    }

    public static void main(String[] args) {
        new AnimalMain();
    }

}
