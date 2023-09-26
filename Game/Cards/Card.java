package Game.Cards;

import java.util.LinkedList;

public class Card {
    public enum CardArchetype {
        Unicorn,
        Magic,
        Modifier,
        Neigh
    };

    public final String name;
    public final CardArchetype cardArchetype;

    Card(String name, CardArchetype cardArchetype) {
        this.name = name;
        this.cardArchetype = cardArchetype;
    }

    public static LinkedList<Card> GenerateNursery() {
        var nursery = new LinkedList<Card>();
        return nursery;
    }

    public static LinkedList<Card> GenerateDeck() {
        var deck = new LinkedList<Card>();
        return deck;
    }
};