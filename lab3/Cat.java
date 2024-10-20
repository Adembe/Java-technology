package lab3;

public class Cat extends PetAnimal{
    private String catName;
    private String catSong;
    private int catLegs;

    public Cat(String catName, String catSong, int catLegs) {
        super(catName, catSong, catLegs);
        this.catName = catName;
        this.catSong = catSong;
        this.catLegs = catLegs;
    }

    public String getCatName() {
        return catName;
    }

    public String getCatSong() {
        return catSong;
    }

    public int getCatLegs() {
        return catLegs;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public void setCatSong(String catSong) {
        this.catSong = catSong;
    }

    public void setCatLegs(int catLegs) {
        this.catLegs = catLegs;
    }

    @Override
    public void displayCharacteristics() {
        System.out.println("Cat"+
                "\n\tName : "+getCatName()+
                "\n\tCharacteristics"+
                "\n\t\tSong : "+getCatSong()+
                "\n\t\tLegs : "+getCatLegs()
        );
    }
}
