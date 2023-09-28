package Game.Cards;
import Game.Turn;

public class CardAction {
    public interface Action {
        void doIt(Turn turn);
    }

    public final boolean may; // The user does not have to fulfill this action.
    public final Action action; // The action function object.

    public CardAction(boolean may, Action action) {
        this.may = may;
        this.action = action;
    }

    public CardAction(Action action) {
        this.may = false;
        this.action = action;
    }
}