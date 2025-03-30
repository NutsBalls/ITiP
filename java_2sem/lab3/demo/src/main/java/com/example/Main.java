package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Goblin goblin = context.getBean("goblin", Goblin.class);
        Mermaid mermaid = context.getBean("mermaid", Mermaid.class);
        Dragon dragon = context.getBean("dragon", Dragon.class);

        System.out.printf("%s %d %d\n", goblin.getName(), goblin.getHealth(), goblin.getGold());
        System.out.printf("%s %d %d\n", mermaid.getName(), mermaid.getHealth(), mermaid.getWaterPower());
        System.out.printf("%s %d %d\n", dragon.getName(), dragon.getHealth(), dragon.getFirePower());

        System.out.println("Количество созданных монстров: " + Monster.getMonsterCount());

        goblin.attack();
        goblin.defend();

        mermaid.attack();
        mermaid.defend();

        dragon.attack();
        dragon.defend();
    }
}