package Balatro_Pizza_Game.src.Order;

import java.util.Random;
import java.util.Arrays;
import java.util.List;


public class Order {
    private PizzaType pizza;
    private Boolean status = false;
    Random rand = new Random();
    PizzaType[] pizzas = PizzaType.values();

    public Order() {
        int  index = rand.nextInt(pizzas.length);
        this.pizza = pizzas[index];
    }

    @Override
    public String toString() {
        return "Pedido de " + this.pizza.getNome() + ". Ingredientes: " + this.pizza.getToppings().toString();
    }


    public PizzaType getRandomPizza() {
        int  index = rand.nextInt(pizzas.length);
        this.pizza = pizzas[index];
        return pizza;
    }
}
