public class Main {
    public static void main(String[] args){
        // Создание объектов без параметров (по умолчанию)
        Goblin goblin = new Goblin();
        Mermaid mermaid = new Mermaid();
        Dragon dragon = new Dragon();

        // Вывод значений полей объектов с помощью геттеров
        System.out.printf("%s %d %d\n", goblin.getName(), goblin.getHealth(), goblin.getGold());
        System.out.printf("%s %d %d\n", mermaid.getName(), mermaid.getHealth(), mermaid.getWaterPower());
        System.out.printf("%s %d %d\n", dragon.getName(), dragon.getHealth(), dragon.getFirePower());

        // Вывод количества созданных монстров
        System.out.println("Количество созданных монстров: " + Monster.getMonsterCount());

        // Вызов методов объектов
        goblin.attack();
        goblin.defend();

        mermaid.attack();
        mermaid.defend();

        dragon.attack();
        dragon.defend();

        // Создание объектов с параметрами
        Goblin customGoblin = new Goblin("Злой Гоблин", 70, 20, 150);
        Mermaid customMermaid = new Mermaid("Могущественная Русалка", 130, 25, 80);
        Dragon customDragon = new Dragon("Огромный Дракон", 250, 70, 200);

        // Вывод значений полей объектов с параметрами
        System.out.printf("%s %d %d\n", customGoblin.getName(), customGoblin.getHealth(), customGoblin.getGold());
        System.out.printf("%s %d %d\n", customMermaid.getName(), customMermaid.getHealth(), customMermaid.getWaterPower());
        System.out.printf("%s %d %d\n", customDragon.getName(), customDragon.getHealth(), customDragon.getFirePower());

        // Повторный вывод количества созданных монстров
        System.out.println("Количество созданных монстров: " + Monster.getMonsterCount());

        // Изменение параметров объектов с помощью сеттеров
        customGoblin.setName("Реальный Гоблин");
        customGoblin.setHealth(60);
        customGoblin.setGold(120);

        customMermaid.setName("Реальная Русалка");
        customMermaid.setHealth(140);
        customMermaid.setWaterPower(90);

        customDragon.setName("Реальный Дракон");
        customDragon.setHealth(300);
        customDragon.setFirePower(220);

        // Вывод измененных параметров объектов
        System.out.printf("%s %d %d\n", customGoblin.getName(), customGoblin.getHealth(), customGoblin.getGold());
        System.out.printf("%s %d %d\n", customMermaid.getName(), customMermaid.getHealth(), customMermaid.getWaterPower());
        System.out.printf("%s %d %d\n", customDragon.getName(), customDragon.getHealth(), customDragon.getFirePower());
    }
}