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

        Knight k1 = context.getBean(Knight.class);
        Knight k2 = context.getBean(Knight.class);

        if (k1 == k2) {
            System.out.println("Knight references k1 and k2 are pointing to the same object\n" +
                    "Mem loc for k1: " + k1 + "\nMem loc for k2: " + k2);
        } else {
            System.out.println("Knight references k1 and k2 are pointing to a different objects\n" +
                    "Mem loc for k1: " + k1 + "\nMem loc for k2: " + k2);
        }

        context.close();
    }
}
