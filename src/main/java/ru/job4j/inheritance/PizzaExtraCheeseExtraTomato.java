package ru.job4j.inheritance;

public class PizzaExtraCheeseExtraTomato extends PizzaExtraCheese {
    PizzaExtraCheese pizzaExtraCheese = new PizzaExtraCheese();

    @Override
    public String name() {
        return pizzaExtraCheese.name() + "+ extra tomato";
    }
}
