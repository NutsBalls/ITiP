package lab5;

public class Mermaid implements Monster {
    private String name;
    private int health;
    private int attackPower;
    private int waterPower;

    public Mermaid(String name, int health, int attackPower, int waterPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.waterPower = waterPower;
    }

    public Mermaid() {
        this("Русалка", 120, 15, 60);
    }

    @Override public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getHealth() { return health; }
    public void setHealth(int health) { this.health = health; }
    public int getAttackPower() { return attackPower; }
    public void setAttackPower(int attackPower) { this.attackPower = attackPower; }
    public int getWaterPower() { return waterPower; }
    public void setWaterPower(int waterPower) { this.waterPower = waterPower; }

    @Override
    public void attack() {
        System.out.println(name + " использует водяную атаку с силой " + waterPower + "!");
    }

    @Override
    public void defend() {
        System.out.println(name + " создаёт водяной щит для защиты!");
    }
}