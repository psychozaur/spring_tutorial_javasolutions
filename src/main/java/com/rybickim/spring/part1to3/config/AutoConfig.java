package com.rybickim.spring.part1to3.config;

import com.rybickim.spring.part1to3.api.IPizza;
import com.rybickim.spring.part1to3.implementations.DeliciousPizza;
import com.rybickim.spring.part1to3.implementations.TastyPizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan("com.rybickim.spring.part1to3.implementations")
//@Import(Config.class)
public class AutoConfig {

    @Bean
    public List<IPizza> listOfPizza(){
        List<IPizza> listOfPizza = new ArrayList<>();
        listOfPizza.add(new DeliciousPizza(16, "exotic"));
        listOfPizza.add(new TastyPizza(12, "good"));
        listOfPizza.add(new DeliciousPizza(17, "splendid"));
        return listOfPizza;
    }
}
