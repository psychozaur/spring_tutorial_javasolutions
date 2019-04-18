package com.rybickim.spring.part4.api;

public interface ICook {
    void takeIngredientsFromStorage();
    void takeIngredientsFromStorage(int ingredientCount);
    void preparePizza();
    void preparePizza(int pizzaId);
    void givePizza();
}
