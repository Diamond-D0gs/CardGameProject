package Game.Cards;

public class MagicUnicornCard extends UnicornCard {
    public final Action enterStable; // When the card is entered into the player's stable.
    public final Action inStable; // When the card is already in a player's stable;
    public final Action onPlay; // When the card is played by the player.

    public MagicUnicornCard(String name, Action enterStable, Action inStable, Action onPlay) {
        super(name, UnicornType.Magic);
        this.enterStable = enterStable;
        this.inStable = inStable;
        this.onPlay = onPlay;
    }
}
