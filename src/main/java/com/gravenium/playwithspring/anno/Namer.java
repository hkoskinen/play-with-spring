package com.gravenium.playwithspring.anno;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Namer {

    @Value("${anno.name}")
    private String name;

    public String getName() {
        return name;
    }
}
