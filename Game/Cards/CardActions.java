package Game.Cards;

import Game.Player;

/**
 * An immutable aggregation of CardAction instances associated with different actions.
 */
public class CardActions {
    /**
     * Helps build an instance of CardActions.
     */
    public static class CardActionsBuilder {
        private CardAction onEnterStable = null;
        private CardAction onExitStable = null;
        private CardAction inStable = null;
        private CardAction onSacrifice = null;

        /**
         * Sets the CardAction associated with entering the stable.
         * @param onEnterStable CardAction associated with entering the stable.
         * @return A reference to the CardActionsBuilder.
         */
        public CardActionsBuilder SetOnEnterStable(CardAction onEnterStable) {
            this.onEnterStable = onEnterStable;
            return this;
        }

        /**
         * Sets the CardAction associated with exiting the stable.
         * @param onExitStable CardAction associated with entering the stable.
         * @return A reference to the CardActionsBuilder.
         */
        public CardActionsBuilder SetOnExitStable(CardAction onExitStable) {
            this.onExitStable = onExitStable;
            return this;
        }

        /**
         * Sets the CardAction associated with being in the stable.
         * @param inStable CardAction associated with being in the stable.
         * @return A reference to the CardActionsBuilder.
         */
        public CardActionsBuilder SetInStable(CardAction inStable) {
            this.inStable = inStable;
            return this;
        }

        /**
         * Sets the CardAction associated with being sacrificed.
         * @param onSacrifice CardAction associated with being sacrificed.
         * @return A reference to the CardActionsBuilder.
         */
        public CardActionsBuilder SetOnSacrifice(CardAction onSacrifice) {
            this.onSacrifice = onSacrifice;
            return this;
        }

        /**
         * Constructs the instance of CardActions.
         * @return An instance of CardActions, or null if none if the actions were set.
         */
        public CardActions Build() {
            if (onEnterStable == null && onExitStable == null && inStable == null && onSacrifice == null)
                return null;
            else
                return new CardActions(onEnterStable, onExitStable, inStable, onSacrifice);
        }
    }

    /**
     * Stores a lambda that modifies a player's state, & a flag that indicating if the action is optional.
     */
    public static class CardAction {
        /**
         * An interface to allow the creation of action lambdas.
         */
        public interface Action {
            public void doIt(Player player);
        }

        public final boolean may; // If true, player can choose to do action if they want.
        public final Action action;

        public CardAction(boolean may, Action action) {
            this.may = may;
            this.action = action;
        }
    }

    public final CardAction onEnterStable; // Action that triggers when a card enters a stable.
    public final CardAction onExitStable; // Action that triggers when a card exits a stable.
    public final CardAction inStable; // Action that triggers in the beginning of a turn when a card is in a stable.
    public final CardAction onSacrifice; // Action that triggers when a card is sacrificed.

    private CardActions(CardAction onEnterStable, CardAction onExitStable, CardAction inStable, CardAction onSacrifice) {
        this.onEnterStable = onEnterStable;
        this.onExitStable = onExitStable;
        this.inStable = inStable;
        this.onSacrifice = onSacrifice;
    }
}
