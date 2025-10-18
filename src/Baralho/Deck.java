package Baralho;

import java.security.SecureRandom;

public class Deck {

    int deckSize = 52;

    int currentCard = 0;

    private Card deck[] = new Card[deckSize];
    private final Card naipes[] = new Card[4];

    public Deck(){
        for(int i = 0; i < naipes.length; i++){
            for(int j = 0; j < Toppings.values().length; j++){
                deck [(i* Toppings.values().length)+j] = new Card(Quality.values()[i], Toppings.values()[j]);
            }
        }
    }

    public void getDeckString(){
        for(Card i : deck){
            System.out.println(i.toString());
        }
    }

    public void shuffle (){
        SecureRandom rand = new SecureRandom();

        int r;
        for (int i = 0; i < deckSize; i++){
            r = rand.nextInt(deckSize);
            Card aux = deck[i];
            deck[i] = deck[r];
            deck[r] = aux;
        }
    }

    public Card dealCard() {
        if (currentCard < deckSize) {
            return deck[currentCard++];
        }
        else {
            return null;
        }

    }

}