package Balatro_Pizza_Game.Order;

import Balatro_Pizza_Game.Baralho.Toppings;

public enum Pizza {
    PEPPERONI("Pizza de Pepperoni",100,Toppings.PEPPERONI, Toppings.CHEESE),
    PORTUGUESA("Pizza Portuguesa",200,Toppings.PEPPERONI, Toppings.CHEESE, Toppings.BELL_PEPPERS, Toppings.ONIONS);

    private String nome;
    private int chips;
    private Toppings[] toppings;
    Pizza(String nome,int chips, Toppings... toppings){
        this.nome = nome;
        this.chips = chips;
        this.toppings = toppings;
    }

    public String getNome() {
        return nome;
    }

    public int getChips() {
        return chips;
    }
    public Toppings[] getToppings() {
        return toppings;
    }
}
