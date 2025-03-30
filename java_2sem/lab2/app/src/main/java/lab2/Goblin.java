package lab2;

public class Goblin extends Monster {
    private int gold;

    public Goblin(String name, int health, int attackPower, int gold) {
        super(name, health, attackPower);
        this.gold = gold;
    }

    public Goblin() {
        super();
        this.gold = 0;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    @Override
    public void attack() {
        System.out.println(getName() + " attacks with force " + getAttackPower() + "!");
    }

    @Override
    public void defend() {
        System.out.println(getName() + " defends himself !");
    }
}