package lab5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    
    @Bean(name = "dragon")
    public lab5.Dragon dragon() {
        return new lab5.Dragon("Драконий король", 200, 30, 150);
    }
    
    @Bean(name = "goblin")
    public lab5.Goblin goblin() {
        return new lab5.Goblin("Гоблин-вор", 80, 20, 50);
    }
    
    @Bean(name = "mermaid")
    public lab5.Mermaid mermaid() {
        return new lab5.Mermaid("Ариэль", 120, 15, 60);
    }

    @Bean(name = "dragonOwner")
    public lab5.MonsterOwner getDragonOwner() {
        return new MonsterOwner(dragon());
    }

    @Bean(name = "goblinOwner")
    public lab5.MonsterOwner getGoblinOwner() {
        return new MonsterOwner(goblin());
    }

    @Bean(name = "mermaidOwner")
    public lab5.MonsterOwner getMermaidOwner() {
        return new MonsterOwner(mermaid());
    }
}