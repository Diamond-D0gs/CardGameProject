package Game.Cards;

public class NeighCard extends Card {
    public final boolean isSuperNeigh;

    public NeighCard(String name, String imageFileName, boolean isSuperNeigh, int cardID) {
        super(name, imageFileName, cardID);
        this.isSuperNeigh = isSuperNeigh;
    }
}
