package textgame;

public class BigStick extends Item{
    public BigStick(String name) {
        super(name);
    }

    @Override
    public void apply(Character c) {
        c.attack += 10;
        c.speed += 1;
    }

    @Override
    public void remove(Character c) {
        c.attack -= 10;
        c.speed -= 1;
    }
}
