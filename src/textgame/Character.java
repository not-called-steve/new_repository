package textgame;

public class Character {
    int size;
    int attack;
    int defence;
    int speed;
    int health;
    String name;

    public void damage(int damage) {
        health -= damage;
    }

    public void attack(Character target) {
        int rnd = (int)(Math.random() * 10);
        if(rnd + attack > target.defence) {
            System.out.println(name + " successfully hits " + target.name);
            target.damage(size * attack);
        }
        else {
            System.out.println(name + " misses " + target.name);
        }
    }
}
