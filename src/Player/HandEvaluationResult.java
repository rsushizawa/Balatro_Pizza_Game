package Player;

import Order.PizzaType;
import Order.PokerHand;

public class HandEvaluationResult {
    private PokerHand pokerHand;
    private PizzaType pizzaType;

    public HandEvaluationResult(PokerHand pokerHand, PizzaType pizzaType) {
        this.pokerHand = pokerHand;
        this.pizzaType = pizzaType;
    }

    public PokerHand getPokerHand() {
        return pokerHand;
    }

    public PizzaType getPizzaType() {
        return pizzaType;
    }

    public int getTotalChips() {
        int chips = pokerHand.getChips();
        if (pizzaType != null) {
            chips += pizzaType.getChips();
        }
        return chips;
    }

    public int getTotalMult() {
        int mult = pokerHand.getMult();
        if (pizzaType != null) {
            mult += pizzaType.getMult();
        }
        return mult;
    }
}