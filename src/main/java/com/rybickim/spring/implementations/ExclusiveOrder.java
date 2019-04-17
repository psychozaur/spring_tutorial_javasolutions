package com.rybickim.spring.implementations;

import com.rybickim.spring.api.IOrder;
import com.rybickim.spring.api.IPizza;
import com.rybickim.spring.api.TastyPizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Primary
public class ExclusiveOrder implements IOrder {

    @Value("#{listOfPizza[2]}")
    private IPizza pizza;
    @Autowired
    private List<IPizza> listOfPizza;

    public ExclusiveOrder() {
        super();
    }

    public void printOrder() {
        System.out.println("Exclusive order: " + pizza.getName() + ", price: " + pizza.getPrice());
    }

    public IPizza getPizza() {
        return pizza;
    }

//    @Autowired
//    @TastyPizza
//    @Value("#{deliciousPizza}")
    public void setPizza(IPizza pizza) {
        this.pizza = pizza;
    }
}
