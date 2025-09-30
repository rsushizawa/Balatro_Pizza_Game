package Balatro_Pizza_Game.Order;

import Balatro_Pizza_Game.Baralho.Toppings;

import java.util.ArrayList;
import java.util.List;

public enum PizzaType {
    PEPPERONI("Pizza de Pepperoni",100,Toppings.PEPPERONI, Toppings.CHEESE),
    QUEIJO("Pizza de Queijo",100,Toppings.OREGANO, Toppings.CHEESE),
    CARNE("Pizza de Carne",100,Toppings.CHEESE, Toppings.PEPPERONI, Toppings.BACON, Toppings.CHICKEN,Toppings.SAUSAGE),
    FRANGOEBACON("Pizza de Frango e Bacon",100,Toppings.CHEESE, Toppings.BACON, Toppings.CHICKEN),
    SALSICHAPICANTE("Pizza de Salsicha Picante",100,Toppings.CHEESE, Toppings.SAUSAGE, Toppings.PEPPERS, Toppings.ONIONS),
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
