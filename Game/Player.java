package Game;

import java.util.LinkedList;

import Game.Cards.Card;

/**
 * Class representing a player in the game.
 */
public class Player {
    private LinkedList<Card> hand;
    private Stable stable;

    private boolean notUnicorns = false; // Unicorns are not considered unicorns and are uneffected by cards that effect unicorns.
    private boolean notMagicUnicorns = false; // All magic unicorns are considered basic unicorns.
    private boolean cantUpgrade = false; // Cannot use upgrade cards.
    private boolean cantNeigh = false; // Cannot use neigh cards.

    /**
     * Constructs an instance of a Player.
     */
    public Player() {
        hand = new LinkedList<Card>();
        stable = new Stable();
    } 
}
