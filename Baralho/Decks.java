package Balatro_Pizza_Game.Baralho;
import java.util.List;

public class Decks{
    private Card deck[] = new Card[52];
    private Card naipes[] = new Card[4];

    public Decks(){
        for(int i = 0; i < naipes.length; i++){
            for(int j = 0; j < Toppings.values().length; j++){
                deck [(i* Toppings.values().length)+j] = new Card(Quality.values()[i], Toppings.values()[j]);
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