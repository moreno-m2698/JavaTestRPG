package Entity;

public class Entity
{
    public int health;
    public int mana;
    public int attack;
    public int defense;
    public String name;

    public Entity(int health, int mana, int attack, int defense, String name) {
        this.health = health;
        this.mana = mana;
        this.attack = attack;
        this.defense = defense;
        this.name = name;
    }
    public Entity() {

    }


}
