public abstract class Monster {
    private String name;
    private int health;
    private int attackPower;
    private static int monsterCount = 0;

    public Monster(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        monsterCount++;
    }

    public Monster() {
        this("Чудище", 100, 10);
    }

    public static int getMonsterCount() {
        return monsterCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public abstract void attack();
    public abstract void defend();
}

