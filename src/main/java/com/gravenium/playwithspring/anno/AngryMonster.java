package com.gravenium.playwithspring.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component() // uses the default bean id -> angryMonster
public class AngryMonster implements Monster {

    private Weapon weapon;

    /*
    // constructor injection
    @Autowired
    public AngryMonster(Weapon weapon) {
        this.weapon = weapon;
    }
    */

    // setter injection
    @Autowired
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public String attack() {
        return "Angry monster attacking angrily! Rawr! " + this.weapon.makeDmg();
    }

}
