package lab4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = 
            new AnnotationConfigApplicationContext(SpringConfig.class);
        
        Monster dragon = context.getBean("dragon", Monster.class);
        Monster goblin = context.getBean("goblin", Monster.class);
        Monster mermaid = context.getBean("mermaid", Monster.class);
        
        MonsterOwner dragonOwner = new MonsterOwner(dragon);
        MonsterOwner goblinOwner = new MonsterOwner(goblin);
        MonsterOwner mermaidOwner = new MonsterOwner(mermaid);
        
        dragonOwner.printMonsterInfo();
        System.out.println("---");
        goblinOwner.printMonsterInfo();
        System.out.println("---");
        mermaidOwner.printMonsterInfo();
        
        context.close();
    }
}