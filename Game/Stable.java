package Game;
import java.security.InvalidParameterException;
import java.util.LinkedList;
import java.util.List;

import Game.Cards.Card;
import Game.Cards.MagicUnicornCard;
import Game.Cards.ModifierCard;
import Game.Cards.Unicorn;
import Game.Cards.CardAction;

/**
 * Represents a player's Stable in the game.
 */
public class Stable {
    private LinkedList<ModifierCard> modifiers;
    private LinkedList<Unicorn> unicorns;

    /**
     * Constructs an instance of a Stable.
     */
    public Stable() {
        modifiers = new LinkedList<ModifierCard>();
        unicorns = new LinkedList<Unicorn>();
    }

    /**
     * Adds a Card to the Stable.
     * @param card Card to be added to the Stable.
     * @param player Player to act upon if the Card has an OnEnterStable Action.
     * @return A reference to the Stable.
     * @throws InvalidParameterException Card type must be Modifier or Unicorn.
     */
    public Stable AddCard(Card card, Player player) throws InvalidParameterException {
        CardAction onEnterStable = null;

        if (card instanceof Unicorn) {
            unicorns.add((Unicorn)card);
            if (card instanceof MagicUnicornCard)
                onEnterStable = ((MagicUnicornCard)card).onEnterStable;
        } 
        else if (card instanceof ModifierCard) {
            modifiers.add((ModifierCard)card);
            onEnterStable = ((ModifierCard)card).onEnterStable;
        }
        else
            throw new InvalidParameterException("Card type must be Modifier or Unicorn");

        if (onEnterStable != null)
            if (!onEnterStable.may)
                onEnterStable.doIt(player);

        return this;
    }

    /**
     * Adds a List of Cards to the Stable.
     * @param cards Cards to be added to the Stable.
     * @param player Player to act upon if the Card has an OnEnterStable Action.
     * @return A reference to the Stable.
     * @throws InvalidParameterException Card type must be Modifier or Unicorn.
     */
    public Stable AddCards(List<Card> cards, Player player) throws InvalidParameterException {
        for (Card card : cards)
            AddCard(card, player);

        return this;
    }

    /**
     * Gets the List of ModifierCards in the stable.
     * @return A List of ModifierCards.
     */
    public List<ModifierCard> GetModifierCards() {
        return modifiers;
    }

    /**
     * Gets the List of UnicornCards in the stable.
     * @return A List of UnicornCards.
     */
    public List<Unicorn> GetUnicornCards() {
        return unicorns;
    }
}
