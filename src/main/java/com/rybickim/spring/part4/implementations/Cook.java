package com.rybickim.spring.part4.implementations;

import com.rybickim.spring.part4.api.ICook;

public class Cook implements ICook {

    public void takeIngredientsFromStorage() {
        System.out.println("The cook is taking ingredients");
//        throw new IllegalAccessError();
    }

    public void preparePizza() {
        System.out.println("The cook is preparing pizza");
    }

    public void givePizza() {
        System.out.println("The cook is giving pizza");
    }
}
