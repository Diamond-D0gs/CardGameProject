package Game.Cards;

public class NeighCard extends Card {
    public final boolean isSuperNeigh;

    public NeighCard(String name, String imageFileName, boolean isSuperNeigh) {
        super(name, imageFileName);
        this.isSuperNeigh = isSuperNeigh;
    }
}
