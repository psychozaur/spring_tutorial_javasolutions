package com.rybickim.spring.part4;

import com.rybickim.spring.part4.api.ICook;
import com.rybickim.spring.part4.config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        ICook cook = context.getBean(ICook.class);
        cook.takeIngredientsFromStorage();
        cook.preparePizza();
        cook.givePizza();
    }
}
