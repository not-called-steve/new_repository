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

    @Test
    public void testTeamRocketAttack() {
        TeamRocket c1 = new TeamRocket(50, 15, 20, 5, 1, "TEAMROCKET");
        Character c2 = new Character(50, 15, 0,5, 1, "SHEEP");
        c1.attack(c2);
        assertEquals(20, c2.health);
    }

    @Test
    public void blobbyDurabilityTest() {
        MrBlobby c1 = new MrBlobby(50, 20, 0, 5, 1, "BLOBBY");
        Character c2 = new Character(50, 15, 0,5, 1, "SHEEP");
        c2.attack(c1);
        assertEquals(40, c1.health);
        c1.attack(c2);
        assertEquals(50, c1.health);
        assertEquals(30, c2.health);
    }
}
