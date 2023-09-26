package Game.Cards;
import Game.Turn;

public interface Action {
    public void doIt(Turn turn);
}