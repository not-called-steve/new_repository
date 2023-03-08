package textgame;

public class Stick extends Item{
    public Stick(String name) {
        super(name);
    }

    @Override
    public void apply(Character c) {
        c.attack += 5;
    }

    @Override
    public void remove(Character c) {
        c.attack -= 5;
    }
}
