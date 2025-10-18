package Balatro_Pizza_Game.src.Player;

import Balatro_Pizza_Game.src.Baralho.Card;
import Balatro_Pizza_Game.src.Baralho.Toppings;
import Balatro_Pizza_Game.src.Order.PizzaType;

import java.util.*;
import java.util.stream.Collectors;

public class HandEvaluator {

    public PizzaType evaluateHand(List<Card> cards) {
        if (isRoyalFlush(cards)) return PizzaType.ROYAL_FLUSH;
        if (isStraightFlush(cards)) return PizzaType.STRAIGHT_FLUSH;
        if (isFourOfAKind(cards)) return PizzaType.FOUR_OF_A_KIND;
        if (isFullHouse(cards)) return PizzaType.FULL_HOUSE;
        if (isFlush(cards)) return PizzaType.FLUSH;
        if (isStraight(cards)) return PizzaType.STRAIGHT;
        if (isThreeOfAKind(cards)) return PizzaType.THREE_OF_A_KIND;
        if (isTwoPair(cards)) return PizzaType.TWO_PAIR;
        if (isOnePair(cards)) return PizzaType.PAIR;
        return PizzaType.HIGH_CARD;
    }

    private boolean isOnePair(List<Card> cards) {
        return getValueCounts(cards).containsValue(2L);
    }

    private boolean isTwoPair(List<Card> cards) {
        return getValueCounts(cards).values().stream().filter(count -> count == 2L).count() == 2;
    }

    private boolean isThreeOfAKind(List<Card> cards) {
        return getValueCounts(cards).containsValue(3L);
    }

    private boolean isStraight(List<Card> cards) {
        List<Integer> ranks = cards.stream().map(card -> card.getTopping().getId()).sorted().collect(Collectors.toList());
        if (ranks.size() < 5) return false;
        // Ace-low straight (A, 2, 3, 4, 5)
        if (ranks.equals(Arrays.asList(2, 3, 4, 5, 14))) return true;

        for (int i = 0; i < ranks.size() - 1; i++) {
            if (ranks.get(i+1) - ranks.get(i) != 1) {
                return false;
            }
        }
        return true;
    }

    private boolean isFlush(List<Card> cards) {
        return cards.stream().map(Card::getNaipe).distinct().count() == 1;
    }

    private boolean isFullHouse(List<Card> cards) {
        return isOnePair(cards) && isThreeOfAKind(cards);
    }

    private boolean isFourOfAKind(List<Card> cards) {
        return getValueCounts(cards).containsValue(4L);
    }

    private boolean isStraightFlush(List<Card> cards) {
        return isStraight(cards) && isFlush(cards);
    }

    private boolean isRoyalFlush(List<Card> cards) {
        List<Toppings> royalFlushToppings = Arrays.asList(Toppings.TEN, Toppings.JACK, Toppings.QUEEN, Toppings.KING, Toppings.ACE);
        List<Toppings> cardToppings = cards.stream().map(Card::getTopping).collect(Collectors.toList());
        return isStraightFlush(cards) && cardToppings.containsAll(royalFlushToppings);
    }

    private Map<Toppings, Long> getValueCounts(List<Card> cards) {
        return cards.stream().collect(Collectors.groupingBy(Card::getTopping, Collectors.counting()));
    }
}
