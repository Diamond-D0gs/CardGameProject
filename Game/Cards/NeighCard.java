package Game.Cards;

/**
 * Card that can be played outside of turn to counter select CardActions.
 */
public class NeighCard extends Card {
    /**
     * Flag indicating if the NeighCard is a Super Neigh. Cannot be Neighed or Super Neighed.
     */
    public final boolean isSuperNeigh;

    /**
     * Constructs a Card representing a NeighCard.
     * @param name The name of the Card.
     * @param imageFileName Path to an image representing the NeighCard.
     * @param isSuperNeigh Flag indicating if the NeighCard is a Super Neigh.
     * @param cardID ID of the Card.
     */
    public NeighCard(String name, String imageFileName, boolean isSuperNeigh, int cardID) {
        super(name, imageFileName, cardID);
        this.isSuperNeigh = isSuperNeigh;
    }
}
