package Baralho;
import Baralho.Decks;

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

        System.out.println("------------------------------------");
        System.out.println("------------Ordered Deck------------");
        System.out.println("------------------------------------");
        
        Decks a = new Decks();
        a.getDeckString();

        System.out.println("------------------------------------");
        System.out.println("------------Shuffled Deck-----------");
        System.out.println("------------------------------------");
        
        a.shuffleDeck();
        a.getDeckString();
        
    }








}
