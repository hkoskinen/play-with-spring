package com.gravenium.playwithspring.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component() // uses the default bean id -> angryMonster
public class AngryMonster implements Monster {

    // field injection
    @Autowired
    @Qualifier("greatSword") // use the specific bean id you want to use
    private Weapon weapon;

    /*
    // constructor injection
    @Autowired
    public AngryMonster(Weapon weapon) {
        this.weapon = weapon;
    }
    */

    /*
    // setter injection
    @Autowired
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    */

    @Override
    public String attack() {
        return "Angry monster attacking angrily! Rawr! " + this.weapon.makeDmg();
    }


    @PostConstruct
    public void init() {
        System.out.println("AngryMonster was created");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("AngryMonster will soon be destroyed");
    }

}
