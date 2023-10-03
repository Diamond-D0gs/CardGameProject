package Game.Cards;

import javax.swing.ImageIcon;

public abstract class Card {
    public final String name;
    public final ImageIcon icon;

    public Card(String name, String imageFileName) {
        this.name = name;
        this.icon = null;
    }
}