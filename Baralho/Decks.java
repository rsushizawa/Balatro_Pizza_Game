package Baralho;

import java.util.Arrays;
import java.util.Collections;

public class Decks{
    private Card deck[] = new Card[56];
    private String naipes[] = {"BAD", "DECENT", "GOOD", "PERFECT"};

    public Decks(){
        for(int i = 0; i < naipes.length; i++){
            for(int j = 0; j < Toppings.values().length; j++){
                deck [(i* Toppings.values().length)+j] = new Card(naipes[i], Toppings.values()[j]);
            }
        }
    }
    
    public void shuffleDeck() {
        Collections.shuffle(Arrays.asList(deck));
    }

    public void getDeckString(){
        for(int i=0; i<deck.length; i++){
            System.out.println(deck[i].toString());
        }
    }
}