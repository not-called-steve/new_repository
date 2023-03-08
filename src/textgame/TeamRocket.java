package textgame;

public class TeamRocket extends NPC{

    public TeamRocket(int health, int attack, int defence, int speed, int size, String name) {
        super(health, attack, defence, speed, size, name);
    }

    @Override
    public void attack(Character target) {
        int rnd = (int) (Math.random() * 10);
        if (rnd + attack > target.defence) {
            System.out.println(name + " successfully hits " + target.name);
            target.damage(size * attack);
            target.damage(size * attack);
        } else {
            System.out.println(name + " misses " + target.name);
        }
    }
}
