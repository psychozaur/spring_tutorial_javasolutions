package com.rybickim.spring.part4.implementations;

import com.rybickim.spring.part4.api.ICook;

public class Cook implements ICook {

    public void takeIngredientsFromStorage() {
        System.out.println("The cook is taking ingredients from storage");
//        throw new IllegalAccessError();
    }

    public void takeIngredientsFromStorage(int ingredientCount) {
        System.out.println("The cook is taking " + ingredientCount + " ingredients from storage");
    }

    public void preparePizza() {
        System.out.println("The cook is preparing pizza");
    }

    public void preparePizza(int pizzaID) {
        System.out.println("The cook is preparing a pizza with ID: " + pizzaID);
    }

    public void givePizza() {
        System.out.println("The cook is giving pizza");
    }
}
