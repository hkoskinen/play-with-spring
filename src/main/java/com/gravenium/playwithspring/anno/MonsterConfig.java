package com.gravenium.playwithspring.anno;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.gravenium.playwithspring.anno") // works like XML component-scan
public class MonsterConfig {

}
