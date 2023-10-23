package Game;

/**
 * Class representing a player in the game.
 */
public abstract class Player {
    public final Hand hand;
    public final Stable stable;

    /**
     * Constructs an instance of a Player.
     */
    protected Player(Hand hand, Stable stable) {
        this.hand = hand;
        this.stable = stable;
    }
}
