package textgame;

public class Hands extends Item{
    public Hands(String name) {
        super(name);
    }

    public void hit(Character target) {
        target.damage(1);
    }
}
