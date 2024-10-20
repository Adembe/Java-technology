package lab3;

abstract class PetAnimal {
    private String name;
    private String song;
    private int legs;

    public PetAnimal(String name, String song, int legs) {
        this.name = name;
        this.song = song;
        this.legs = legs;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String getName() {
        return name;
    }

    public String getSong() {
        return song;
    }

    public int getLegs() {
        return legs;
    }

    public abstract void displayCharacteristics();
}
