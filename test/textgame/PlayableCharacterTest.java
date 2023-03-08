package textgame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayableCharacterTest {
    @Test
    public void testCharacterCreation() {
        textgame.PlayableCharacter c1 = new textgame.PlayableCharacter(50, 15, 20, 5, 1, "ZORRO");
        assertEquals(0, c1.experience);
    }
}
