package com.rybickim.spring.part4.config;

import com.rybickim.spring.part4.api.ICook;
import com.rybickim.spring.part4.aspects.Communication;
import com.rybickim.spring.part4.aspects.StorageControl;
import com.rybickim.spring.part4.implementations.Cook;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class Config {
    @Bean
    public ICook cook(){
        return new Cook();
    }

    @Bean
    public Communication communication(){
        return new Communication();
    }

    @Bean
    public StorageControl storageControl(){
        return new StorageControl();
    }
}
