package com.gravenium.playwithspring.anno;

import org.springframework.stereotype.Component;

@Component() // uses the default bean id -> angryMonster
public class AngryMonster implements Monster {

    @Override
    public String attack() {
        return "Angry monster attacking angrily! Rawr!";
    }

}
