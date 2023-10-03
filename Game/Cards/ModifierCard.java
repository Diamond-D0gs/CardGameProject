package Game.Cards;

public class ModifierCard extends Card {
    public final CardActions cardActions;
    
    public ModifierCard(String name, String imageFileName, CardActions cardActions) {
        super(name, imageFileName);
        this.cardActions = cardActions;
    }
}