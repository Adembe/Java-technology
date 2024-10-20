package lab3;

public class Parrot extends PetAnimal{
    private String parrotName;
    private String parrotSong;
    private int parrotLegs;

    public Parrot(String parrotName, String parrotSong, int parrotLegs) {
        super(parrotName, parrotSong, parrotLegs);
        this.parrotName = parrotName;
        this.parrotSong = parrotSong;
        this.parrotLegs = parrotLegs;
    }

    public String getParrotName() {
        return parrotName;
    }

    public String getParrotSong() {
        return parrotSong;
    }

    public int getParrotLegs() {
        return parrotLegs;
    }

    public void setParrotName(String parrotName) {
        this.parrotName = parrotName;
    }

    public void setParrotSong(String parrotSong) {
        this.parrotSong = parrotSong;
    }

    public void setParrotLegs(int parrotLegs) {
        this.parrotLegs = parrotLegs;
    }

    @Override
    public void displayCharacteristics() {
        System.out.println("Parrot"+
                "\n\tName : "+getParrotName()+
                "\n\tCharacteristics"+
                "\n\t\tSong : "+getParrotSong()+
                "\n\t\tLegs : "+getParrotLegs()
        );
    }
}
