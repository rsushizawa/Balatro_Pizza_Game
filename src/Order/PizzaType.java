package Balatro_Pizza_Game.src.Order;

import Balatro_Pizza_Game.src.Baralho.Toppings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum PizzaType {
    MARGHERITA("Margherita", 20, 2, Toppings.SEVEN, Toppings.FIVE, Toppings.NINE, Toppings.ACE), // Tomatoes, Basil, Cheese, Olive Oil
    PEPPERONI("Pepperoni", 25, 3, Toppings.NINE, Toppings.KING), // Cheese, Sausage
    MEAT_LOVERS("Meat Lovers", 30, 4, Toppings.JACK, Toppings.QUEEN, Toppings.KING), // Bacon, Ham, Sausage
    VEGGIE("Veggie", 15, 2, Toppings.DEUCE, Toppings.THREE, Toppings.FOUR, Toppings.FIVE, Toppings.SIX, Toppings.SEVEN, Toppings.EIGHT, Toppings.TEN); // All veggie toppings

    private String nome;
    private int chips;
    private int mult;
    private List<Toppings> toppings = new ArrayList<>();

    PizzaType(String nome, int chips, int mult, Toppings... toppings){
        this.nome = nome;
        this.chips = chips;
        this.mult = mult;
        this.toppings.addAll(Arrays.asList(toppings));
    }

    public String getNome() {
        return nome;
    }

    public int getChips() {
        return chips;
    }

    public int getMult() {
        return mult;
    }

    public List<Toppings> getToppings() {
        return toppings;
    }
}