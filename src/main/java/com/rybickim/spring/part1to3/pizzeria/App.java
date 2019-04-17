package com.rybickim.spring.part1to3.pizzeria;

import com.rybickim.spring.part1to3.api.IOrder;
import com.rybickim.spring.part1to3.config.AutoConfig;
import com.rybickim.spring.part1to3.config.Config;
import com.rybickim.spring.part1to3.implementations.ExclusiveOrder;
import com.rybickim.spring.part1to3.implementations.Order;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AutoConfig.class);
        IOrder order = context.getBean(IOrder.class);
        order.printOrder();
        IOrder order2 = context.getBean(Order.class);
        order2.printOrder();
    }
}
