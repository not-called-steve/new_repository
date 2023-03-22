package textgame;

public class PlayableCharacter extends Character{
    char mood;
    int experience;

    public PlayableCharacter(int size, int attack, int defence, int speed, int health, String name) {
        super(size, attack, defence, speed, health, name);
    }

    public void equip(Item newItem) {
        equipedItem.remove(this);
        equipedItem = newItem;
        equipedItem.apply(this);
    }
}
