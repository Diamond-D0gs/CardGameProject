package Game;
import java.util.LinkedList;

import Game.Cards.Card;

public class Player {
    public final LinkedList<Card> hand;
    public final LinkedList<Card> stable;

    public Player(LinkedList<Card> hand, LinkedList<Card> stable) {
        this.hand = hand;
        this.stable = stable;
    }
}
