package com.gravenium.playwithspring.anno;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MonsterMainJavaConfig {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MonsterConfig.class);
        Monster monster = context.getBean("strongMonster", Monster.class);
        System.out.println(monster.attack());
        context.close();
    }

}
