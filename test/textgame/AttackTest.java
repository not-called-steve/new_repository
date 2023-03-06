package textgame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AttackTest {
    @Test
    public void testHitting() {
        Character c1 = new Character(50, 15, 20, 5, 1, "ZORRO");
        Character c2 = new Character(50, 15, 0,5, 1, "SHEEP");
        c1.attack(c2);
        assertEquals(35, c2.health);
    }
}
