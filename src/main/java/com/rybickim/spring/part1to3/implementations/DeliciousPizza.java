package com.rybickim.spring.part1to3.implementations;

import com.rybickim.spring.part1to3.api.IPizza;
import com.rybickim.spring.part1to3.api.TastyPizza;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
@TastyPizza
public class DeliciousPizza implements IPizza {

    private Logger log = Logger.getLogger("DeliciousPizza");

    private int price;
    private String name;
    @Value("#{tastyPizza.getPrice() matches '[1-9]'}")
    boolean regexBoolean;

    public DeliciousPizza(@Value("#{tastyPizza.getPrice() > 13 ? 13 : 20}") int price, @Value("#{tastyPizza.getName()?.toUpperCase()}") String name) {
        super();
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        log.info(regexBoolean + "");
        return price;
    }

    public String getName() {
        return name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }
}
