package Balatro_Pizza_Game.Baralho;
import java.util.ArrayList;
import java.util.List;

public class Decks{
    private List<Card> deck = new ArrayList<Card>();
    private String naipes[] = {"Hearts", "Diamonds", "Clubs", "Spades"};

    public Decks(){
        for(int i = 0; i < naipes.length; i++){
            for(int j = 0; j < Toppings.values().length; j++){
                deck.add(new Card(naipes[i], Toppings.values()[j]));
            }
        }
    }

    public void getDeckSting(){
        for(Card card : deck){
            System.out.println(card.toString());
        }
    }

    public Card drawCard(){
        return this.deck.removeFirst();
    }
}