package lab3;

public class FurnitureStore{
    private Furniture[] furniture = new Furniture[10];
    private int index;

    public FurnitureStore() {
        Chair chair1 = new Chair(4, 30, 20, 20, true, 100, "Modern");
        Table table1 = new Table(4, 30, 40, 40, false, 200, "Classic");
        Bed bed1 = new Bed(4, 60, 80, 80, false, 500, "stretches");

        addFurniture(chair1);
        addFurniture(table1);
        addFurniture(bed1);

        displayAllInformation();
    }

    public void addFurniture(Furniture item) {
        if (index < furniture.length) {
            furniture[index] = item;
            index++;
        }
        else {
            System.out.println("List Dvvrsen baina");
        }
    }

    public void displayAllInformation(){
        for (int i = 0; i < index; i++) {
            furniture[i].displayFurnitureInfo();
        }
    }

    public static void main(String[] args) {
        new FurnitureStore();
    }
}
