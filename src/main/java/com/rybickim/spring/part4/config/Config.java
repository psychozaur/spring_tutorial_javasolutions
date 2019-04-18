package com.rybickim.spring.part4.config;

import com.rybickim.spring.part4.api.ICook;
import com.rybickim.spring.part4.api.IZapiekanka;
import com.rybickim.spring.part4.aspects.AspectZapiekanka;
import com.rybickim.spring.part4.aspects.Communication;
import com.rybickim.spring.part4.aspects.StorageControl;
import com.rybickim.spring.part4.implementations.Cook;
import com.rybickim.spring.part4.implementations.CookAssistant;
import com.rybickim.spring.part4.implementations.Zapiekanka;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class Config {

    @Bean
    public IZapiekanka iZapiekanka() {
        return new Zapiekanka();
    }

    @Bean
    public AspectZapiekanka aspectZapiekanka(){
        return new AspectZapiekanka();
    }

    @Bean
    @Qualifier("cook")
    public ICook cook(){
        return new Cook();
    }

    @Bean
    @Qualifier("cook_assistant")
    public ICook cookAssistant(){
        return new CookAssistant();
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
