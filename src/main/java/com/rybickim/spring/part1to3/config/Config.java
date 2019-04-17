package com.rybickim.spring.part1to3.config;

import com.rybickim.spring.part1to3.api.IOrder;
import com.rybickim.spring.part1to3.api.IPizza;
import com.rybickim.spring.part1to3.implementations.DeliciousPizza;
import com.rybickim.spring.part1to3.implementations.Order;
import com.rybickim.spring.part1to3.implementations.TastyPizza;
import org.springframework.context.annotation.Bean;

//@Configuration
public class Config {
    @Bean
    public IPizza pizza(){
        return new DeliciousPizza(25,"BBQ Fromage");
    }
//
//    @Bean(name = "order2")
//    public IOrder order(IPizza pizza){
//        return new Order(pizza);
//    }
}
