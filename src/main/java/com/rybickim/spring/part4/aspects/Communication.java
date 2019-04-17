package com.rybickim.spring.part4.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Communication {

    @After("execution(* com.rybickim.spring.part4.api.ICook.takeIngredientsFromStorage(..))")
    public void informAboutTakingIngredient(){
        System.out.println("Ingredients were taken");
    }

    @Around("execution(* com.rybickim.spring.part4.api.ICook.givePizza(..))")
    public void givingOfPizza(ProceedingJoinPoint joinPoint){
        try {
            System.out.println("WE ANNOUNCE THE PIZZA IS READY");
            joinPoint.proceed();
            System.out.println("WE ANNOUNCE THE PIZZA WAS RECEIVED");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}
