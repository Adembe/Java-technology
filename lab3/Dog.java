package lab3;

import java.awt.*;

public class Dog extends PetAnimal{
    private String dogName;
    private String dogSong;
    private int dogLegs;

    public Dog(String dogName, String dogSong, int dogLegs) {
        super(dogName, dogSong, dogLegs);
        this.dogName = dogName;
        this.dogSong = dogSong;
        this.dogLegs = dogLegs;
    }

    public String getDogName() {
        return dogName;
    }

    public String getDogSong() {
        return dogSong;
    }

    public int getDogLegs() {
        return dogLegs;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public void setDogSong(String dogSong) {
        this.dogSong = dogSong;
    }

    public void setDogLegs(int dogLegs) {
        this.dogLegs = dogLegs;
    }

    @Override
    public void displayCharacteristics() {
        System.out.println("Dog"+
                "\n\tName : "+getDogName()+
                        "\n\tCharacteristics"+
                "\n\t\tSong : "+getDogSong()+
                "\n\t\tLegs : "+getDogLegs()
                );
    }
}
