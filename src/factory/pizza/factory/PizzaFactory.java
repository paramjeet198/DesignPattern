package factory.pizza.factory;

import factory.pizza.pizzas.CheesePizza;
import factory.pizza.pizzas.PepperoniPizza;
import factory.pizza.pizzas.Pizza;
import factory.pizza.pizzas.VeggiePizza;

public class PizzaFactory {

    public Pizza createPizza(String type) {
        System.out.println("\n############ PLEASE WAIT - CREATING PIZZA ###############\n");

        return switch (type) {
            case "cheese" -> new CheesePizza();
            case "pepperoni" -> new PepperoniPizza();
            case "veggie" -> new VeggiePizza();
            default -> null;
        };
    }

    public Pizza createPizza(PizzaType type) {
        System.out.println("\n############ PLEASE WAIT - CREATING PIZZA ###############\n");

        return switch (type) {
            case PizzaType.CHEESE -> new CheesePizza();
            case PizzaType.PEPPERONI -> new PepperoniPizza();
            case PizzaType.VEGGIE -> new VeggiePizza();
        };
    }
}
