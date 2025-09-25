package Balatro_Pizza_Game.Baralho;


public class Decks{
    private Card deck[] = new Card[56];
    private String naipes[] = {"Hearts", "Diamonds", "Clubs", "Spades"};

    public Decks(){
        for(int i = 0; i < naipes.length; i++){
            for(int j = 0; j < Toppings.values().length; j++){
                deck [(i* Toppings.values().length)+j] = new Card(naipes[i], Toppings.values()[j]);
            }
        }
    }

    public void getDeckSting(){
        for(int i=0; i<deck.length; i++){
            System.out.println(deck[i].toString());
        }
    }
}