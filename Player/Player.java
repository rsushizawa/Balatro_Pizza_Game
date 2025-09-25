package Balatro_Pizza_Game.Player;

import Balatro_Pizza_Game.Baralho.Card;
import Balatro_Pizza_Game.Baralho.Toppings;
import Balatro_Pizza_Game.Order.Pizza;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private int money = 0;

    public Pizza buildPizza(Card... cards) {
        int base_chips = 0;
        List<Toppings> toppings = new ArrayList<>();
        for (Card card : cards) {
            toppings.add(card.getTopping());
        }
        return new Pizza(toppings);
    }

}
