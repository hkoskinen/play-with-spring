package com.gravenium.playwithspring.anno;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MonsterMainJavaConfig {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MonsterConfig.class);
        StrongMonster monster = context.getBean("strongMonster", StrongMonster.class);
        System.out.println(monster.attack());
        System.out.println("My name is " + monster.getName());
        context.close();
    }

}
