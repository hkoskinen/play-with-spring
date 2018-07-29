package com.gravenium.playwithspring.anno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.gravenium.playwithspring.anno") // works like XML component-scan
@PropertySource("classpath:random.properties")
public class MonsterConfig {

    @Bean
    public Weapon warAxe() {
        return new WarAxe();
    }

    @Bean
    public Monster strongMonster() {
        return new StrongMonster(warAxe());
    }

}
