package Game;

import java.util.LinkedList;
import java.util.List;

import Game.Cards.Card;

/**
 * Class representing a player in the game.
 */
public abstract class Player {
    public final Hand hand;
    public final Stable stable;

    /**
     * Constructs an instance of a Player.
     */
    protected Player(List<Card> startingHand) {
        hand = new Hand(startingHand);
        stable = new Stable();
    }
}
