package com.gravenium.playwithspring.anno;

import org.springframework.stereotype.Component;

@Component
public class StrongMonster implements Monster {

    private Weapon weapon;

    public StrongMonster(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public String attack() {
        return "Strong Monster attacking furiously! Waaagghh! " + this.weapon.makeDmg();
    }
}
