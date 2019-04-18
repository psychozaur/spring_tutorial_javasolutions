package com.rybickim.spring.part4.implementations;

import com.rybickim.spring.part4.api.ICook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

//@Deprecated
public class CookAssistant implements ICook {

    @Autowired
    @Qualifier("cook_assistant")
    private ICook cook;

    public void takeIngredientsFromStorage() {
        System.out.println("The assistant is taking ingredients from storage");
    }

    public void takeIngredientsFromStorage(int ingredientCount) {
        System.out.println("The assistant is taking " + ingredientCount + " ingredients from storage");
    }

    public void preparePizza() {
        System.out.println("The assistant is preparing pizza");
        cook.preparePizza();
    }

    public void preparePizza(int pizzaID) {
        System.out.println("The assistant is preparing a pizza with ID: " + pizzaID);
        cook.preparePizza(pizzaID);
    }

    public void givePizza() {
        System.out.println("The assistant is giving pizza");
    }
}
