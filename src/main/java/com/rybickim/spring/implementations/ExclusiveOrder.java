package com.rybickim.spring.implementations;

import com.rybickim.spring.api.IOrder;
import com.rybickim.spring.api.IPizza;
import com.rybickim.spring.api.TastyPizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ExclusiveOrder implements IOrder {

    private IPizza pizza;

    public ExclusiveOrder() {
        super();
    }

    public void printOrder() {
        System.out.println("Exclusive order: " + pizza.getName() + ", price: " + pizza.getPrice());
    }

    public IPizza getPizza() {
        return pizza;
    }

    @Autowired
    @TastyPizza
    public void setPizza(IPizza pizza) {
        this.pizza = pizza;
    }
}
