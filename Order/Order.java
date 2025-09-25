package Balatro_Pizza_Game.Order;

import java.util.Arrays;
import java.util.Random;

public class Order {
    private Pizza pizza;
    private Boolean status = false;

    public Order() {
        Pizza[] pizzas = Pizza.values();
        Random rand = new Random();
        int  index = rand.nextInt(pizzas.length);
        this.pizza = pizzas[index];
    }

    @Override
    public String toString() {
        return "Pedido de " + this.pizza.getNome() + ". Ingrdientes: " + Arrays.toString(this.pizza.getToppings());
    }
}
