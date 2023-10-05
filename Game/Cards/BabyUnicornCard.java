package Game.Cards;

/**
 * Card representing a Baby Unicorn.
 */
public class BabyUnicornCard extends Card implements Unicorn {
    /**
     * Constructs a Card representing a Baby Unicorn.
     * @param name Name of the Baby Unicorn.
     * @param imageFileName Path to image representing the Card.
     * @param cardID ID of the Card.
     */
    public BabyUnicornCard(String name, String imageFileName, int cardID) {
        super(name, imageFileName, cardID);
    }
}
