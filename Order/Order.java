package Balatro_Pizza_Game.Order;

import java.util.Random;
import java.util.Arrays;
import java.util.List;


public class Order {
    private PizzaType pizza;
    private Boolean status = false;

    public Order() {
        PizzaType[] pizzas = PizzaType.values();
        Random rand = new Random();
        int  index = rand.nextInt(pizzas.length);
        this.pizza = pizzas[index];
    }

    @Override
    public String toString() {
        return "Pedido de " + this.pizza.getNome() + ". Ingrdientes: " + this.pizza.getToppings().toString();
    }
}
