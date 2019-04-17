package com.rybickim.spring.part4.aspects;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class StorageControl {

    @Pointcut("execution(* com.rybickim.spring.part4.api.ICook.takeIngredientsFromStorage(..))")
    public void pointCut(){

    }

    @Before("pointCut()")
    public void checkIngredientsInStorage(){
        System.out.println("Checking storage state");
    }

    @AfterThrowing("pointCut()")
    public void notifyEmptyStorage(){
        System.out.println("Storage is empty!");
    }
}
