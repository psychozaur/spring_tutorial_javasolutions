package com.rybickim.spring.part4;

import com.rybickim.spring.part4.api.ICook;
import com.rybickim.spring.part4.api.IZapiekanka;
import com.rybickim.spring.part4.config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        ICook cook = (ICook) context.getBean("cook");
        ((IZapiekanka) cook).prepareZapiekanka();
//        cook.takeIngredientsFromStorage(6);
//        cook.preparePizza(23);
//        cook.givePizza();
//        ICook assistant = (ICook) context.getBean("cookAssistant");
//        assistant.takeIngredientsFromStorage();

    }
}
