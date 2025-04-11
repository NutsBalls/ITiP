package lab2;

public class Mermaid extends Monster {
    private int waterPower;

    public Mermaid(String name, int health, int attackPower, int waterPower) {
        super(name, health, attackPower);
        this.waterPower = waterPower;
    }

    public Mermaid() {
        super();
        this.waterPower = 50;
    }

    public int getWaterPower() {
        return waterPower;
    }

    public void setWaterPower(int waterPower) {
        this.waterPower = waterPower;
    }

    @Override
    public void attack() {
        System.out.println(getName() + " uses water attack with force " + waterPower + "!");
    }

    @Override
    public void defend() {
        System.out.println(getName() + " creates a water shield for protection!");
    }
}