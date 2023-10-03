package Game.Cards;

public class CardState {
    public enum State {
        InHand,
        InStable,
        EnteredStable
    }

    public final Card card;
    public final State state;

    public CardState(Card card, State state) {
        this.card = card;
        this.state = state;
    }

    public CardState UpdateState(State state) {
        return new CardState(card, state);
    }
}
