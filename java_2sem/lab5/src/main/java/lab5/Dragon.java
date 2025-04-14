package lab5;

public class Dragon implements Monster {
    private String name;
    private int health;
    private int attackPower;
    private int firePower;

    public Dragon(String name, int health, int attackPower, int firePower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.firePower = firePower;
    }

    public Dragon() {
        this("Дракон", 200, 30, 150);
    }

    @Override public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getHealth() { return health; }
    public void setHealth(int health) { this.health = health; }
    public int getAttackPower() { return attackPower; }
    public void setAttackPower(int attackPower) { this.attackPower = attackPower; }
    public int getFirePower() { return firePower; }
    public void setFirePower(int firePower) { this.firePower = firePower; }

    @Override
    public void attack() {
        System.out.println(name + " дышит огнем с силой " + firePower + "!");
    }

    @Override
    public void defend() {
        System.out.println(name + " поднимает огненную стену для защиты!");
    }
}