package com.gravenium.playwithspring.anno;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MonsterMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annocontext.xml");
        Monster monster = context.getBean("angryMonster", Monster.class);
        System.out.println(monster.attack());
        context.close();
    }
}
