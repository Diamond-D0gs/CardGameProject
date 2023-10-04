package Game.Cards;

import javax.swing.ImageIcon;

public abstract class Card {
    public final String name;
    public final ImageIcon icon;
    public final int cardID;

    public Card(String name, String imageFileName, int cardID) {
        this.name = name;
        this.icon = null;
        this.cardID = cardID;
    }
}