package lab2;

public class Dragon extends Monster {
    private int firePower;

    public Dragon(String name, int health, int attackPower, int firePower) {
        super(name, health, attackPower);
        this.firePower = firePower;
    }

    public Dragon() {
        super();
        this.firePower = 100;
    }

    public int getFirePower() {
        return firePower;
    }

    public void setFirePower(int firePower) {
        this.firePower = firePower;
    }

    @Override
    public void attack() {
        System.out.println(getName() + " breathes fire with force " + firePower + "!");
    }

    @Override
    public void defend() {
        System.out.println(getName() + " raises a wall of fire for protection!");
    }
}