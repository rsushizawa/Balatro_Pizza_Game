package Balatro_Pizza_Game;

import java.util.*;
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
        System.out.println(pizzaOrder);
    }








}
