package textgame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameTest {

    @Test
    public void testCharacterCreation() {
        textgame.Character c1 = new textgame.Character(50, 15, 20, 5, 1, "ZORRO");
    }

    @Test
    public void testItemEquip() {
        Item i1 = new Stick("stick");
        Item i2 = new Item("nothing");
        PlayableCharacter c1 = new textgame.PlayableCharacter(50, 15, 20, 5, 1, "ZORRO");
        c1.equip(i1);
        assertEquals(20, c1.attack);
        c1.equip(i2);
        assertEquals(15, c1.attack);
    }
}
