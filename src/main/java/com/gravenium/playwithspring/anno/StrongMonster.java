package com.gravenium.playwithspring.anno;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class StrongMonster implements Monster {

    private Weapon weapon;

    // field level injection
    @Value("${anno.name}")
    private String name;

    public StrongMonster(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public String attack() {
        return "Strong Monster attacking furiously! Waaagghh! " + this.weapon.makeDmg();
    }

    public String getName() {
        return name;
    }
}
