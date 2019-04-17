package com.rybickim.spring.config;

import com.rybickim.spring.api.IOrder;
import com.rybickim.spring.api.IPizza;
import com.rybickim.spring.implementations.DeliciousPizza;
import com.rybickim.spring.implementations.Order;
import com.rybickim.spring.implementations.TastyPizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
