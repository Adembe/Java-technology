package lab9;

import java.io.IOException;

public class CharacterPrint {
    public CharacterPrint() {
        Character character = new Character();
        Character character1 = new Character();
        Character character2 = new Character();
        character.start();
        character1.start();
        character2.start();
        try {
            character.join();
            character1.join();
            character2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        new CharacterPrint();
    }
}
