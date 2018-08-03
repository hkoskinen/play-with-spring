package com.gravenium.playwithspring.web;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebMvc
@Configuration
@ComponentScan("com.gravenium.playwithspring.web")
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        //InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        //registry.viewResolver(viewResolver);
        registry.jsp().prefix("/WEB-INF/views/");
    }

}
