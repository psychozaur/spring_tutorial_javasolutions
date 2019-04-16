package com.rybickim.spring.implementations;

import com.rybickim.spring.api.IPizza;

public class DeliciousPizza implements IPizza {

    private int price;
    private String name;

    public DeliciousPizza(int price, String name) {
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
