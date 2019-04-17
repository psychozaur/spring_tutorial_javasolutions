package com.rybickim.spring.implementations;

import com.rybickim.spring.api.IOrder;
import com.rybickim.spring.api.IPizza;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Order implements IOrder {

    private IPizza pizza;

    public Order(@Qualifier("dobraa") IPizza pizza) {
        super();
        this.pizza = pizza;
    }

    public void printOrder() {
        System.out.println("Order: " + pizza.getName() + ", price: " + pizza.getPrice());
    }
}
