package Game.Cards;

import Game.Player;

public class CardActions {
    public static class CardActionsBuilder {
        private CardAction onEnterStable = null;
        private CardAction onExitStable = null;
        private CardAction inStable = null;
        private CardAction onPlay = null;
        private CardAction onSacrifice = null;

        public CardActionsBuilder SetOnEnterStable(CardAction onEnterStable) {
            this.onEnterStable = onEnterStable;
            return this;
        }

        public CardActionsBuilder SetOnExitStable(CardAction onExitStable) {
            this.onExitStable = onExitStable;
            return this;
        }

        public CardActionsBuilder SetInStable(CardAction inStable) {
            this.inStable = inStable;
            return this;
        }

        public CardActionsBuilder SetOnPlay(CardAction onPlay) {
            this.onPlay = onPlay;
            return this;
        }

        public CardActionsBuilder SetOnSacrifice(CardAction onSacrifice) {
            this.onSacrifice = onSacrifice;
            return this;
        }

        public CardActions Build() {
            if (onEnterStable == null && onExitStable == null && inStable == null && onPlay == null && onSacrifice == null)
                return null;
            else
                return new CardActions(onEnterStable, onExitStable, inStable, onPlay, onSacrifice);
        }
    }

    public static class CardAction {
        public interface Action {
            public void doIt(Player player);
        }

        public final boolean may;
        public final Action action;

        public CardAction(boolean may, Action action) {
            this.may = may;
            this.action = action;
        }
    }

    public final CardAction onEnterStable;
    public final CardAction onExitStable;
    public final CardAction inStable;
    public final CardAction onPlay;
    public final CardAction onSacrifice;

    private CardActions(CardAction onEnterStable, CardAction onExitStable, CardAction inStable, CardAction onPlay, CardAction onSacrifice) {
        this.onEnterStable = onEnterStable;
        this.onExitStable = onExitStable;
        this.inStable = inStable;
        this.onPlay = onPlay;
        this.onSacrifice = onSacrifice;
    }
}
