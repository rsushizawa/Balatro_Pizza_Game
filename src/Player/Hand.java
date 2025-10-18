package Player;

import Baralho.Card;

import Baralho.Deck;
import Baralho.Toppings;
import Order.Pizza;
import Order.PizzaType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hand {
    private ArrayList<Card> cards = new ArrayList<Card>();
    private int maxHandSize = 7;

    public Hand(Deck deck) {
        for(int i = 0; i < maxHandSize; i++){
            cards.add(deck.dealCard());
        }
    }

    public void addCardToHand(Deck deck) {
        cards.add(deck.dealCard());

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
