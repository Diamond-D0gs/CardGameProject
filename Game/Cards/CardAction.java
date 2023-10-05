package Game.Cards;

import Game.Player;

/**
 * Stores a lambda that modifies a player's state, & a flag indicating if the action is optional.
 */
public class CardAction {
    /**
     * An interface to allow the creation of action lambdas.
     */
    public interface Action {
        public void doIt(Player player);
    }

    /**
     * If true, player can choose to do the action if they want.
     */
    public final boolean may;
    private final Action action;

    /**
     * Immutable aggregation of an Action lambda & a flag that indicating if the action is optional.
     * @param may Flag indicating if the action is optional.
     * @param action Lambda that modifies a player's state.
     */
    public CardAction(boolean may, Action action) {
        this.may = may;
        this.action = action;
    }

    /**
     * Executes the Action lambda.
     * @param player Player object to be acted on.
     */
    public void doIt(Player player) {
        action.doIt(player);
    }
}