package Balatro_Pizza_Game.Baralho;

import java.util.*;
import Balatro_Pizza_Game.Order.Order;
public class ShuffleToppings {
    public static void main(String[] args) {
        List<Toppings> pizzaToppings = new ArrayList<>(Arrays.asList(Toppings.values()));
        Set<Toppings> pizzaOrder= EnumSet.noneOf(Toppings.class);
        Random rand = new Random();
        int i;
        Collections.shuffle(pizzaToppings);
        for ( i= 0; i < 6; i ++) {
            pizzaOrder.add(pizzaToppings.get(i));
        }
        System.out.println(pizzaToppings);
        //System.out.println(pizzaOrder);
        Decks a = new Decks();
        //a.getDeckString();
        Order o = new Order();
        System.out.println(o.toString());
    }
}
