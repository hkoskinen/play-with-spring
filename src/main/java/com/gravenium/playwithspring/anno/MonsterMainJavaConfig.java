package com.gravenium.playwithspring.anno;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MonsterMainJavaConfig {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MonsterConfig.class);
        Monster monster = context.getBean(Monster.class);
        System.out.println(monster.attack());
        context.close();
    }

}
