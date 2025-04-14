package lab5;

public class Goblin implements Monster {
    private String name;
    private int health;
    private int attackPower;
    private int gold;

    public Goblin(String name, int health, int attackPower, int gold) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.gold = gold;
    }

    public Goblin() {
        this("Гоблин", 80, 20, 50);
    }

    @Override public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getHealth() { return health; }
    public void setHealth(int health) { this.health = health; }
    public int getAttackPower() { return attackPower; }
    public void setAttackPower(int attackPower) { this.attackPower = attackPower; }
    public int getGold() { return gold; }
    public void setGold(int gold) { this.gold = gold; }

    @Override
    public void attack() {
        System.out.println(name + " атакует с силой " + attackPower + "!");
    }

    @Override
    public void defend() {
        System.out.println(name + " защищается!");
    }
}