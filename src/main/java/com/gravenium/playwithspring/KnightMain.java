package com.gravenium.playwithspring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("knight.xml");
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        knight.doDailyTraining();

        Fielder fielder = context.getBean(Fielder.class);
        System.out.println("My name is " + fielder.getName());
        System.out.println("My email address is " + fielder.getEmail());

        context.close();
    }
}
