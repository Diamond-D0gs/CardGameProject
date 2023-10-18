package Game;

import java.util.LinkedList;
import java.util.List;

import Game.Cards.Card;

public class Hand {
    public final int DEFAULT_HAND_LIMIT = 7;

    private LinkedList<Card> cards;
    private int handLimit = DEFAULT_HAND_LIMIT;

    public Hand(List<Card> startingHand) {
        cards = new LinkedList<Card>(startingHand);
    }

    public List<Card> GetCards() {
        return cards;
    }

    public int Size() {
        return cards.size();
    }

    public Hand Add(Card card) {
        cards.add(card);
        return this;
    }

    public Hand Add(List<Card> cards) {
        this.cards.addAll(cards);
        return this;
    }

    public Hand Remove(int index) {
        cards.remove(index);
        return this;
    }

    public Hand Remove(int startIndex, int endIndex) {
        cards.removeAll(cards.subList(startIndex, endIndex));
        return this;
    }

    public Hand Clear() {
        cards.clear();
        return this;
    }

    public Hand SwapCards(Hand other) {
        LinkedList<Card> temp = this.cards;
        this.cards = other.cards;
        other.cards = temp;
        return this;
    }
}
