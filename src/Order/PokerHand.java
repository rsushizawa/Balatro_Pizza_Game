package Balatro_Pizza_Game.src.Order;

import Balatro_Pizza_Game.src.Baralho.Toppings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum PokerHand {
    ROYAL_FLUSH("Royal Flush", 100, 50),
    STRAIGHT_FLUSH("Strait Flush", 75, 15),
    FOUR_OF_A_KIND("Four of a Kind", 60, 12),
    FULL_HOUSE("Full House", 40, 7),
    FLUSH("Flush", 35, 5),
    STRAIGHT("Straight", 30, 4),
    THREE_OF_A_KIND("Three of a Kind", 20, 3),
    TWO_PAIR("Two Pair", 15, 2),
    PAIR("Pair", 10, 1),
    HIGH_CARD("High Card", 5, 0);

    private String nome;
    private int chips;
    private int mult;

    PokerHand(String nome, int chips, int mult){
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
}