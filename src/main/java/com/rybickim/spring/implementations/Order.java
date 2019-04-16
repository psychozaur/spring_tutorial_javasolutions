package com.rybickim.spring.implementations;

import com.rybickim.spring.api.IOrder;
import com.rybickim.spring.api.IPizza;

public class Order implements IOrder {

    private IPizza pizza;

    public Order(IPizza pizza) {
        super();
        this.pizza = pizza;
    }

    public void printOrder() {
        System.out.println("Order: " + pizza.getName() + ", price: " + pizza.getPrice());
    }
}
