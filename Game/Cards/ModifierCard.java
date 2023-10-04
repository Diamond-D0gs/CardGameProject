package Game.Cards;

public class ModifierCard extends Card {
    public final CardActions cardActions;
    
    public ModifierCard(String name, String imageFileName, int cardID, CardActions cardActions) {
        super(name, imageFileName, cardID);
        this.cardActions = cardActions;
    }
}