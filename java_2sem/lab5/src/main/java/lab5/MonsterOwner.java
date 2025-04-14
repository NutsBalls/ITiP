package lab5;

public class MonsterOwner {
    private Monster monster;

    public MonsterOwner(Monster monster) {
        this.monster = monster;
    }

    public void printMonsterInfo() {
        System.out.println("Информация о монстре:");
        monster.attack();
        monster.defend();
    }
}