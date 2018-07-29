package com.gravenium.playwithspring.anno;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MonsterMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annocontext.xml");
        Monster monster = context.getBean("angryMonster", Monster.class);
        System.out.println(monster.attack());

        Namer namer = context.getBean(Namer.class);
        System.out.println("My name is " + namer.getName());

        context.close();

    }
}
