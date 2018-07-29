package com.gravenium.playwithspring.anno;

import org.springframework.stereotype.Component;

@Component
public class GreatSword implements Weapon {

    @Override
    public String makeDmg() {
        return "Swing the Great Sword like you mean it!";
    }

}
