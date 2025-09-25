package Balatro_Pizza_Game.Baralho;
public class Card {
    private String naipe;
    private Toppings topping;
    
    public Card(String naipe, Toppings Topping){
        this.naipe = naipe;
        this.topping = Topping;
    }

    public String getNaipe() {
        return naipe;
    }

    public Toppings getTopping() {
        return topping;
    }

    @Override
    public String toString(){
        return this.topping + " of " + this.naipe;
    }
}