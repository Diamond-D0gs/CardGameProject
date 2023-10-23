package Game;

import java.security.InvalidParameterException;
import java.util.List;

import Game.Cards.Card;

public class LocalPlayer extends Player {
    private boolean notUnicorns = false; // Unicorns are not considered unicorns and are uneffected by cards that effect unicorns.
    private boolean notMagicUnicorns = false; // All magic unicorns are considered basic unicorns.
    private boolean cantUpgrade = false; // Cannot use upgrade cards.
    private boolean cantNeigh = false; // Cannot use neigh cards.

    int handBase = Hand.DEFAULT_HAND_LIMIT;
    int handDifference = 0;

    public LocalPlayer(List<Card> startingHand) {
        super(startingHand);
    }
    
    public boolean isNotUnicorns() {
        return notUnicorns;
    }
    public LocalPlayer SetNotUnicorns(boolean notUnicorns) {
        this.notUnicorns = notUnicorns;
        return this;
    }
    public boolean IsNotMagicUnicorns() {
        return notMagicUnicorns;
    }
    public LocalPlayer SetNotMagicUnicorns(boolean notMagicUnicorns) {
        this.notMagicUnicorns = notMagicUnicorns;
        return this;
    }
    public boolean IsCantUpgrade() {
        return cantUpgrade;
    }
    public LocalPlayer SetCantUpgrade(boolean cantUpgrade) {
        this.cantUpgrade = cantUpgrade;
        return this;
    }
    public boolean IsCantNeigh() {
        return cantNeigh;
    }
    public LocalPlayer SetCantNeigh(boolean cantNeigh) {
        this.cantNeigh = cantNeigh;
        return this;
    }

    public LocalPlayer SetHandBase(int handBase) throws InvalidParameterException {
        if (handBase < 0)
            throw new InvalidParameterException("handBase cannot be less than 0");
        this.handBase = handBase;
        return this;
    }

    public LocalPlayer AddToHandDifference(int handDifference) throws InvalidParameterException {
        if (handDifference < 0)
            throw new InvalidParameterException("handDifference cannot be less than 0");
        this.handDifference += handDifference;
        return this;
    }

    public LocalPlayer ResetHandBase() {
        handBase = Hand.DEFAULT_HAND_LIMIT;
        return this;
    }

    public LocalPlayer ResetHandDifference() {
        handDifference = 0;
        return this;
    }

    public int GetHandLimit() {
        return handBase - handDifference;
    }
}
