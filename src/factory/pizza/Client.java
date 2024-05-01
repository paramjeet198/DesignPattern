package factory.pizza;

import factory.pizza.factory.PizzaFactory;
import factory.pizza.factory.PizzaType;
import factory.pizza.pizzas.Pizza;

public class Client {

    public static void main(String[] args) {
        PizzaFactory factory = new PizzaFactory();
        Pizza pizza = factory.createPizza(PizzaType.VEGGIE);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

    }
}
