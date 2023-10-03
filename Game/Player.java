package Game;

import java.util.ArrayList;
import java.util.List;

import Game.Cards.Card;

public class Player {
    private ArrayList<Card> hand;
    private ArrayList<Card> stable;

    // Status effects
    private boolean notUnicorns = false; // Unicorns are not considered unicorns and are uneffected by cards that effect unicorns.
    private boolean notMagicUnicorns = false; // All magic unicorns are considered basic unicorns.
    private boolean cantUpgrade = false; // Cannot use upgrade cards.
    private boolean cantNeigh = false; // Cannot use neigh cards.

    // Getters & Setters

    public boolean isNotUnicorns() {
        return notUnicorns;
    }

    public Player setNotUnicorns(boolean notUnicorns) {
        this.notUnicorns = notUnicorns;
        return this;
    }

    public boolean isNotMagicUnicorns() {
        return notMagicUnicorns;
    }

    public Player setNotMagicUnicorns(boolean notMagicUnicorns) {
        this.notMagicUnicorns = notMagicUnicorns;
        return this;
    }

    public boolean isCantUpgrade() {
        return cantUpgrade;
    }

    public Player setCantUpgrade(boolean cantUpgrade) {
        this.cantUpgrade = cantUpgrade;
        return this;
    }

    public boolean isCantNeigh() {
        return cantNeigh;
    }

    public Player setCantNeigh(boolean cantNeigh) {
        this.cantNeigh = cantNeigh;
        return this;
    }

    public Player AddCardsToHand(List<Card> cards) {
        hand.addAll(cards);
        return this;
    }

    public Player AddCardToHand(Card card) {
        hand.add(card);
        return this;
    }

    public Player AddCardsToStable(List<Card> cards) {
        stable.addAll(cards);
        return this;
    }

    public Player AddCardToStable(Card card) {
        stable.add(card);
        return this;
    }
}
