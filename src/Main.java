package Balatro_Pizza_Game.src;

import Balatro_Pizza_Game.src.Baralho.Card;
import Balatro_Pizza_Game.src.Baralho.Deck;
import Balatro_Pizza_Game.src.Baralho.Quality;
import Balatro_Pizza_Game.src.Baralho.Toppings;
import Balatro_Pizza_Game.src.Player.Hand;
import Balatro_Pizza_Game.src.Player.HandEvaluationResult;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();

        Hand hand = new Hand(deck);

        List<Card> cardsInHand = hand.getCards();
        System.out.println("Cards in hand: " + cardsInHand);

        // Royal Flush
        List<Card> royalFlushHand = new ArrayList<>();
        royalFlushHand.add(new Card(Quality.DIAMONDS, Toppings.ACE));
        royalFlushHand.add(new Card(Quality.DIAMONDS, Toppings.KING));
        royalFlushHand.add(new Card(Quality.DIAMONDS, Toppings.QUEEN));
        royalFlushHand.add(new Card(Quality.DIAMONDS, Toppings.JACK));
        royalFlushHand.add(new Card(Quality.DIAMONDS, Toppings.TEN));

        System.out.println("\n--- Testing Royal Flush ---");
        System.out.println("Custom hand: " + royalFlushHand);
        HandEvaluationResult result = hand.evaluatePlayedHand(royalFlushHand);
        System.out.println("Poker hand: " + result.getPokerHand().getNome());
        System.out.println("Is it a pizza? " + (result.getPizzaType() != null ? result.getPizzaType().getNome() : "No"));

        //Let's create a custom hand for testing a Margherita Pizza
        List<Card> margheritaPizzaHand = new ArrayList<>();
        margheritaPizzaHand.add(new Card(Quality.HEARTS, Toppings.SEVEN));
        margheritaPizzaHand.add(new Card(Quality.CLUBS, Toppings.FIVE));
        margheritaPizzaHand.add(new Card(Quality.DIAMONDS, Toppings.NINE));
        margheritaPizzaHand.add(new Card(Quality.SPADES, Toppings.ACE));

        System.out.println("\n--- Testing Margherita Pizza ---");
        System.out.println("Custom hand: " + margheritaPizzaHand);
        result = hand.evaluatePlayedHand(margheritaPizzaHand);
        System.out.println("Poker hand: " + result.getPokerHand().getNome());
        System.out.println("Is it a pizza? " + (result.getPizzaType() != null ? result.getPizzaType().getNome() : "No"));
    }
}
