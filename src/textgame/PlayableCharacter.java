package textgame;

public class PlayableCharacter extends Character{
    char mood;
    int experience;

    public PlayableCharacter(int size, int attack, int defence, int speed, int health, String name, char mood, int experience) {
        super(size, attack, defence, speed, health, name);
    }
}
