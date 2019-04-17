package com.rybickim.spring.config;

import com.rybickim.spring.api.IPizza;
import com.rybickim.spring.implementations.DeliciousPizza;
import com.rybickim.spring.implementations.TastyPizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan("com.rybickim.spring.implementations")
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
