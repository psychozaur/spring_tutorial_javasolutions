package com.rybickim.spring.part1to3.implementations;

import com.rybickim.spring.part1to3.api.IOrder;
import com.rybickim.spring.part1to3.api.IPizza;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Order implements IOrder {

    private IPizza pizza;

    public Order(@Value("#{tastyPizza}") IPizza pizza) {
        super();
        this.pizza = pizza;
    }

    public void printOrder() {
        System.out.println("Order: " + pizza.getName() + ", price: " + pizza.getPrice());
    }
}
