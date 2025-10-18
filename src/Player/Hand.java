package Balatro_Pizza_Game.src.Player;

import Balatro_Pizza_Game.src.Baralho.Card;

import Balatro_Pizza_Game.src.Baralho.Deck;
import Balatro_Pizza_Game.src.Baralho.Toppings;
import Balatro_Pizza_Game.src.Order.Pizza;
import Balatro_Pizza_Game.src.Order.PizzaType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hand {
    private ArrayList<Card> cards = new ArrayList<Card>();
    private int maxHandSize = 7;
    private HandEvaluator handEvaluator;

    public Hand(Deck deck) {
        for(int i = 0; i < maxHandSize; i++){
            cards.add(deck.dealCard());
        }
        this.handEvaluator = new HandEvaluator();
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

    public PizzaType evaluatePlayedHand(List<Card> playedCards) {
        return handEvaluator.evaluateHand(playedCards);
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

}
