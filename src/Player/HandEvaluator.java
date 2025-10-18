package Balatro_Pizza_Game.src.Player;

import Balatro_Pizza_Game.src.Baralho.Card;
import Balatro_Pizza_Game.src.Baralho.Toppings;
import Balatro_Pizza_Game.src.Order.PizzaType;
import Balatro_Pizza_Game.src.Order.PokerHand;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HandEvaluator {

    public HandEvaluationResult evaluateHand(List<Card> cards) {
        PokerHand pokerHand = evaluatePokerHand(cards);
        PizzaType pizzaType = evaluatePizza(cards);
        return new HandEvaluationResult(pokerHand, pizzaType);
    }

    private PokerHand evaluatePokerHand(List<Card> cards) {
        if (isRoyalFlush(cards)) return PokerHand.ROYAL_FLUSH;
        if (isStraightFlush(cards)) return PokerHand.STRAIGHT_FLUSH;
        if (isFourOfAKind(cards)) return PokerHand.FOUR_OF_A_KIND;
        if (isFullHouse(cards)) return PokerHand.FULL_HOUSE;
        if (isFlush(cards)) return PokerHand.FLUSH;
        if (isStraight(cards)) return PokerHand.STRAIGHT;
        if (isThreeOfAKind(cards)) return PokerHand.THREE_OF_A_KIND;
        if (isTwoPair(cards)) return PokerHand.TWO_PAIR;
        if (isOnePair(cards)) return PokerHand.PAIR;
        return PokerHand.HIGH_CARD;
    }

    private PizzaType evaluatePizza(List<Card> cards) {
        List<Toppings> handToppings = cards.stream().map(Card::getTopping).collect(Collectors.toList());
        for (PizzaType pizzaType : PizzaType.values()) {
            if (handToppings.containsAll(pizzaType.getToppings())) {
                return pizzaType;
            }
        }
        return null;
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
