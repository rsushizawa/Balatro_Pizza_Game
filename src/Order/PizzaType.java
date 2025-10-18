package Order;

import Baralho.Toppings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum PizzaType {
    // Hands with specific toppings
    ROYAL_FLUSH("Obra-Prima Gourmet", 100, 50, Toppings.TEN, Toppings.JACK, Toppings.QUEEN, Toppings.KING, Toppings.ACE),

    STRAIGHT_FLUSH("Sabor Sequencial", 75, 15),
    FOUR_OF_A_KIND("Quatro Queijos", 60, 12),
    FULL_HOUSE("Casa Cheia", 40, 7),
    FLUSH("Monocromática", 35, 5),
    STRAIGHT("Degustação em Série", 30, 4),
    THREE_OF_A_KIND("Trio Ternura", 20, 3),
    TWO_PAIR("Combinação Dupla", 15, 2),
    PAIR("Par Perfeito", 10, 1),
    HIGH_CARD("Ingrediente Único", 5, 0);

    private String nome;
    private int chips;
    private int mult; // Balatro uses Chips x Mult for scoring!
    private List<Toppings> toppings = new ArrayList<>();

    PizzaType(String nome, int chips, int mult, Toppings... toppings){
        this.nome = nome;
        this.chips = chips;
        this.mult = mult;
        this.toppings.addAll(Arrays.asList(toppings));
    }

    PizzaType(String nome, int chips, int mult){
        this.nome = nome;
        this.chips = chips;
        this.mult = mult;
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