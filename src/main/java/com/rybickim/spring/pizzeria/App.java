package com.rybickim.spring.pizzeria;

import com.rybickim.spring.api.IOrder;
import com.rybickim.spring.config.AutoConfig;
import com.rybickim.spring.config.Config;
import com.rybickim.spring.implementations.ExclusiveOrder;
import com.rybickim.spring.implementations.Order;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AutoConfig.class);
        IOrder order = context.getBean(IOrder.class);
        order.printOrder();
    }
}
