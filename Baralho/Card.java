package Balatro_Pizza_Game.Baralho;
public class Card {
    private final Quality naipe;
    private final Toppings topping;

    public Card(Quality naipe, Toppings Topping){
        this.naipe = naipe;
        this.topping = Topping;
    }

    public Toppings getTopping() {
        return topping;
    }

    public Quality getNaipe() {
        return naipe;
    }




    public String getEnum() {return this.getTopping().name() + "_" + this.getNaipe().name();}


    @Override
    public String toString(){
        return this.naipe.getSuits() + " "+ this.topping;
    }
}