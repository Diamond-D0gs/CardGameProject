import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import Game.Cards.Card;
import Game.Cards.ModifierCard;
import Game.Cards.UnicornCard;

public class Stable {
    /**
     * Stores the state of a card while it's in a player's stable.
     */
    public class StableState<T extends Card> {
        public final boolean justEntered;
        public final T card;

        StableState(boolean justEntered, T card) {
            this.justEntered = justEntered;
            this.card = card;
        }
    }

    private LinkedList<StableState<ModifierCard>> modifiers;
    private LinkedList<StableState<UnicornCard>> unicorns;

    public Stable() {
        modifiers = new LinkedList<StableState<ModifierCard>>();
        unicorns = new LinkedList<StableState<UnicornCard>>();
    }

    public Stable AddCard(Card card) throws InvalidParameterException {
        if (card instanceof ModifierCard)
            modifiers.push(new StableState<ModifierCard>(true, (ModifierCard)card));
        else if (card instanceof UnicornCard)
            unicorns.push(new StableState<UnicornCard>(true, (UnicornCard)card));
        else
            throw new InvalidParameterException("Card type must be Modifier or Unicorn");

        return this;
    }

    public Stable AddCards(List<Card> cards) throws InvalidParameterException {
        for (Card card : cards)
            AddCard(card);

        return this;
    }

    public List<StableState<ModifierCard>> GetModifierCards() {
        return modifiers;
    }

    public List<StableState<UnicornCard>> GetUnicornCards() {
        return unicorns;
    }

    public Stable UpdateStable() {
        // Update all newly added cards in both lists.
        for (var card : modifiers)
            if (card.justEntered)
                card = new StableState<ModifierCard>(false, card.card);
        for (var card : unicorns)
            if (card.justEntered)
                card = new StableState<UnicornCard>(false, card.card);

        return this;
    }
}
