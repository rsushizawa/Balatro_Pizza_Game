package UI;

import Baralho.Card;

import javax.swing.*;

public class CardButton extends JButton {

    public Card card;

    public CardButton(Card card) {
        this.card = card;
    }
    public Card getCard() {
        return card;
    }
}
