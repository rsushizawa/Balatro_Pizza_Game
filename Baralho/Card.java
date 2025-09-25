package Baralho;
public class Card {
    private String naipe;
    private Toppings Topping;
    
    public Card(String naipe, Toppings Topping){
        this.naipe = naipe;
        this.Topping = Topping;
    }

    @Override
    public String toString(){
        return this.Topping + " of " + this.naipe;
    }
}