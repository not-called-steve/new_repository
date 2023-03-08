package textgame;

public class MrBlobby extends NPC{

    public MrBlobby(int health, int attack, int defence, int speed, int size, String name) {
        super(health, attack, defence, speed, size, name);
    }

    @Override
    public void damage(int damage) {
        health -= damage - 5;
    }

    @Override
    public void attack(Character target) {
        int rnd = (int) (Math.random() * 10);
        if (rnd + attack > target.defence) {
            System.out.println(name + " successfully hits " + target.name);
            target.damage(size * attack);
            health += size * attack / 2;
        } else {
            System.out.println(name + " misses " + target.name);
        }
    }
}
