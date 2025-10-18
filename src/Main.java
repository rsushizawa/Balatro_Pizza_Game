package Balatro_Pizza_Game.src;

import Balatro_Pizza_Game.src.Baralho.Card;
import Balatro_Pizza_Game.src.Baralho.Deck;
import Balatro_Pizza_Game.src.Baralho.Quality;
import Balatro_Pizza_Game.src.Baralho.Toppings;
import Balatro_Pizza_Game.src.Player.Hand;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a deck of cards
        Deck deck = new Deck();

        // Create a player's hand
        Hand hand = new Hand(deck);

        // Get the cards from the hand
        List<Card> cardsInHand = hand.getCards();
        System.out.println("Cards in hand: " + cardsInHand);

        // Let's create a custom hand for testing
        List<Card> customHand = new ArrayList<>();
        customHand.add(new Card(Quality.DIAMONDS, Toppings.ACE));
        customHand.add(new Card(Quality.DIAMONDS, Toppings.KING));
        customHand.add(new Card(Quality.DIAMONDS, Toppings.QUEEN));
        customHand.add(new Card(Quality.DIAMONDS, Toppings.JACK));
        customHand.add(new Card(Quality.DIAMONDS, Toppings.TEN));


        System.out.println("Custom hand: " + customHand);
        System.out.println("Poker hand: " + hand.evaluatePlayedHand(customHand));


        List<Card> customHand2 = new ArrayList<>();
        customHand2.add(new Card(Quality.DIAMONDS, Toppings.ACE));
        customHand2.add(new Card(Quality.SPADES, Toppings.ACE));
        customHand2.add(new Card(Quality.HEARTS, Toppings.ACE));
        customHand2.add(new Card(Quality.CLUBS, Toppings.ACE));
        customHand2.add(new Card(Quality.DIAMONDS, Toppings.TEN));

        System.out.println("Custom hand 2: " + customHand2);
        System.out.println("Poker hand 2: " + hand.evaluatePlayedHand(customHand2));

    }
}
