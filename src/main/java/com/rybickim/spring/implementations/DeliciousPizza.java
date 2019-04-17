package com.rybickim.spring.implementations;

import com.rybickim.spring.api.IPizza;
import com.rybickim.spring.api.TastyPizza;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@TastyPizza
public class DeliciousPizza implements IPizza {

    private int price;
    private String name;

    public DeliciousPizza(@Value("2") int price, @Value("wporzo") String name) {
        super();
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
