package Balatro_Pizza_Game.Order;

import Balatro_Pizza_Game.Baralho.Toppings;

import java.util.ArrayList;
import java.util.List;

public enum PizzaType {
    PEPPERONI("Pizza de Pepperoni",100,Toppings.PEPPERONI, Toppings.CHEESE),
    PORTUGUESA("Pizza Portuguesa",200,Toppings.PEPPERONI, Toppings.CHEESE, Toppings.BELL_PEPPERS, Toppings.ONIONS);

    private String nome;
    private int chips;
    private List<Toppings> toppings = new ArrayList<>();

    PizzaType(String nome, int chips, Toppings... toppings){
        this.nome = nome;
        this.chips = chips;
        for(Toppings topping : toppings){
            this.toppings.add(topping);
        }
    }

    public String getNome() {
        return nome;
    }

    public int getChips() {
        return chips;
    }
    public List<Toppings> getToppings() {
        return toppings;
    }
}
