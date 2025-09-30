package Balatro_Pizza_Game.Player;

import Balatro_Pizza_Game.Baralho.Card;
import Balatro_Pizza_Game.Baralho.Toppings;
import Balatro_Pizza_Game.Order.Pizza;
import Balatro_Pizza_Game.Order.PizzaType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hand {
    private ArrayList<Card> cards = new ArrayList<Card>();

    public void addCard(Card card) {
        cards.add(card);
    }
    public void removeCard(Card card) {
        cards.remove(card);
    }
    public Pizza playCards(Card... cards) {
        List<Toppings> toppings = new ArrayList<>();
        for (Card card : cards) {
            toppings.add(card.getTopping());
        }
        return new Pizza(toppings);
    }

    public PizzaType evaluateHand(Pizza pizza){
        List<PizzaType> pizzaTypes = Arrays.asList(PizzaType.values());
        for (PizzaType pizzaType : pizzaTypes) {
            if (pizzaType.getToppings().equals(pizza.getToppings())) {
                return pizzaType;
            }
        }
        return null;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

}
