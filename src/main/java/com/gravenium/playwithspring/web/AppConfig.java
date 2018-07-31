package com.gravenium.playwithspring.web;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebMvc
@ComponentScan("com.gravenium.playwithspring.web")
public class AppConfig implements WebMvcConfigurer {


}
