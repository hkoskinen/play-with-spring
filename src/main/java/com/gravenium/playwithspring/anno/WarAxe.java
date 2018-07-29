package com.gravenium.playwithspring.anno;

import org.springframework.stereotype.Component;

@Component
public class WarAxe implements Weapon {

    @Override
    public String makeDmg() {
        return "Make a bloody mess with a War Axe!";
    }

}
