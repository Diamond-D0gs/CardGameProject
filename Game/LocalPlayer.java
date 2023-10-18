package Game;

public class LocalPlayer extends Player {
    private boolean notUnicorns = false; // Unicorns are not considered unicorns and are uneffected by cards that effect unicorns.
    private boolean notMagicUnicorns = false; // All magic unicorns are considered basic unicorns.
    private boolean cantUpgrade = false; // Cannot use upgrade cards.
    private boolean cantNeigh = false; // Cannot use neigh cards.

    public LocalPlayer() {}
    
    public boolean isNotUnicorns() {
        return notUnicorns;
    }
    public void setNotUnicorns(boolean notUnicorns) {
        this.notUnicorns = notUnicorns;
    }
    public boolean isNotMagicUnicorns() {
        return notMagicUnicorns;
    }
    public void setNotMagicUnicorns(boolean notMagicUnicorns) {
        this.notMagicUnicorns = notMagicUnicorns;
    }
    public boolean isCantUpgrade() {
        return cantUpgrade;
    }
    public void setCantUpgrade(boolean cantUpgrade) {
        this.cantUpgrade = cantUpgrade;
    }
    public boolean isCantNeigh() {
        return cantNeigh;
    }
    public void setCantNeigh(boolean cantNeigh) {
        this.cantNeigh = cantNeigh;
    }
}
