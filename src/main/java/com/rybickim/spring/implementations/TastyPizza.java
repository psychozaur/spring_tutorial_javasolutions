package com.rybickim.spring.implementations;

import com.rybickim.spring.api.IPizza;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Qualifier("dobraa")
public class TastyPizza implements IPizza {

    private int price;
    private String name;

    public TastyPizza(@Value("13") int price, @Value("hawajska") String name) {
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
