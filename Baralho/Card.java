package Balatro_Pizza_Game.Baralho;
public class Card {
    private Quality naipe;
    private Toppings topping;

    public Card(Quality naipe, Toppings Topping){
        this.naipe = naipe;
        this.topping = Topping;
    }

    public Quality getNaipe() {
        return naipe;
    }

    public Toppings getTopping() {
        return topping;
    }

    @Override
    public String toString(){
        return this.naipe.getSuits() + " "+ this.topping;
    }
}