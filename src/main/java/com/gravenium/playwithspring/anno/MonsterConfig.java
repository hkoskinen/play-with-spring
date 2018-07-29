package com.gravenium.playwithspring.anno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.gravenium.playwithspring.anno") // works like XML component-scan
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
