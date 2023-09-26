package Game.Cards;

public class NeighCard extends Card {
    public final boolean isSuperNeigh;

    public NeighCard(boolean isSuperNeigh) {
        super((!isSuperNeigh) ? "Neigh" : "Super Neigh", CardArchetype.Neigh);
        this.isSuperNeigh = isSuperNeigh;
    }
}
