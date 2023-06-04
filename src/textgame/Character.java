package textgame;

public class Character {
    int size;
    int attack;
    int defence;
    int speed;
    int health;
    String name;

    int newVariable = 5;

    Item equipedItem = new Item("empty");

    public Character(int health, int attack, int defence, int speed, int size, String name) {
        this.health = health;
        this.attack = attack;
        this.defence = defence;
        this.speed = speed;
        this.size = size;
        this.name = name;
    }

    public void damage(int damage) {
        health -= damage;
    }

    public void attack(Character target) {
        int rnd = (int)(Math.random() * 10);
        if(rnd + attack > target.defence) {
            System.out.println(name + " successfully hits " + target.name);
            equipedItem.hit(target);
        }
        else {
            System.out.println(name + " misses " + target.name);
        }
    }
}
