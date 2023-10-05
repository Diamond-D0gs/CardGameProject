package Game.Cards;

import Game.Cards.CardAction.Action;

/**
 * Card that performs an action on a Player when played.
 */
public class MagicCard extends Card {
    /**
     * Action that triggers when the Card is played.
     */
    public final Action onPlay;

    /**
     * Constructs a Card representing a Magic Card.
     * @param name Name of the Card.
     * @param imageFileName Path to an image representing the Unicorn Card.
     * @param cardID ID of the Card.
     * @param onPlay Action that triggers when the card is played.
     */
    public MagicCard(String name, String imageFileName, int cardID, Action onPlay) {
        super(name, imageFileName, cardID);
        this.onPlay = onPlay;
    }
}