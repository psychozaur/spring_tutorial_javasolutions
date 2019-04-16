package com.rybickim.spring.pizzeria;

import com.rybickim.spring.api.IOrder;
import com.rybickim.spring.config.Config;
import com.rybickim.spring.implementations.Order;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        IOrder order = context.getBean(Order.class);
        order.printOrder();
    }
}
