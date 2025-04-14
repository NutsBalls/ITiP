package lab5;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = 
            new AnnotationConfigApplicationContext(SpringConfig.class);
        
        MonsterOwner dragonOwner = context.getBean("dragonOwner", MonsterOwner.class);
        MonsterOwner goblinOwner = context.getBean("goblinOwner", MonsterOwner.class);
        MonsterOwner mermaidOwner = context.getBean("mermaidOwner", MonsterOwner.class);
        
        dragonOwner.printMonsterInfo();
        System.out.println("---");
        goblinOwner.printMonsterInfo();
        System.out.println("---");
        mermaidOwner.printMonsterInfo();
        
        context.close();
    }
}