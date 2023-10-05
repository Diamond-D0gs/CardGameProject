package Game.Cards;

import javax.swing.ImageIcon;

/**
 * Abstract Card that forms the base for all other Card types.
 * Base for Magic, Unicorn, Modifier, & Neigh Cards.
 */
public abstract class Card {
    /**
     * Name of the Card.
     */
    public final String name;

    /**
     * Image representing the Card.
     */
    public final ImageIcon icon;

    /**
     * ID of the Card.
     */
    public final int cardID;

    /**
     * Used in the construction of Magic, Unicorn, Modifier, & Neigh Cards. Can't be instantiated directly.
     * @param name Name of the Card.
     * @param imageFileName Path to an image representing the Unicorn Card.
     * @param cardID ID of the Card.
     */
    protected Card(String name, String imageFileName, int cardID) {
        this.name = name;
        this.icon = null;
        this.cardID = cardID;
    }
}