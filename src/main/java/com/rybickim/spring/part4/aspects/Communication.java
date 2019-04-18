package com.rybickim.spring.part4.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class Communication {

    @Pointcut("args(argumentInt)")
    public void pointcutInt(int argumentInt){

    }

    @Pointcut("target(com.rybickim.spring.part4.api.ICook)")
    public void pointcutTarget(){

    }

    @Pointcut("@target(annotation)")
    public void pointcutTargetAnnotation(Deprecated annotation){

    }

    @Pointcut("within(com.rybickim.spring.part4.implementations.Cook)")
    public void pointcutWithin(){

    }

    @Before("!pointcutWithin() && pointcutInt(arg)")
    public void advice(int arg){
        System.out.println("ADVICE " + arg);
    }

    /*
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
    */
}
