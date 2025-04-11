package lab4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    
    @Bean(name = "dragon")
    public lab4.Dragon dragon() {
        return new lab4.Dragon("Драконий король", 200, 30, 150);
    }
    
    @Bean(name = "goblin")
    public lab4.Goblin goblin() {
        return new lab4.Goblin("Гоблин-вор", 80, 20, 50);
    }
    
    @Bean(name = "mermaid")
    public lab4.Mermaid mermaid() {
        return new lab4.Mermaid("Ариэль", 120, 15, 60);
    }
}