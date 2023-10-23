package Game;

import java.util.LinkedList;
import java.util.List;

import Game.Cards.ModifierCard;
import Game.Cards.Unicorn;

/**
 * Represents a player's Stable in the game.
 */
public abstract class Stable {
    protected LinkedList<ModifierCard> modifiers;
    protected LinkedList<Unicorn> unicorns;

    /**
     * Constructs an instance of a Stable.
     */
    protected Stable() {
        modifiers = new LinkedList<ModifierCard>();
        unicorns = new LinkedList<Unicorn>();
    }

    // /**
    //  * Adds a Card to the Stable.
    //  * @param card Card to be added to the Stable.
    //  * @param player Player to act upon if the Card has an OnEnterStable Action.
    //  * @return A reference to the Stable.
    //  * @throws InvalidParameterException Card type must be Modifier or Unicorn.
    //  */
    // public Stable AddCard(Card card, Player player) throws InvalidParameterException {
    //     boolean localPlayer = player instanceof LocalPlayer;
    //     CardAction onEnterStable = null;

    //     if (card instanceof Unicorn) {
    //         unicorns.add((Unicorn)card);
    //         if (card instanceof MagicUnicornCard)
    //             onEnterStable = ((MagicUnicornCard)card).onEnterStable;
    //     } 
    //     else if (card instanceof ModifierCard) {
    //         modifiers.add((ModifierCard)card);
    //         onEnterStable = ((ModifierCard)card).onEnterStable;
    //     }
    //     else
    //         throw new InvalidParameterException("Card type must be Modifier or Unicorn");
        
    //     if (localPlayer && onEnterStable != null && !onEnterStable.may)
    //         onEnterStable.doIt((LocalPlayer)player);

    //     return this;
    // }

    public abstract Stable AddUnicornCard(Unicorn unicornCard, Player player);
    
    public Stable AddUnicornCards(List<Unicorn> unicornCards, Player player) {
        for (Unicorn unicornCard : unicornCards)
            AddUnicornCard(unicornCard, player);
        return this;
    }
    
    public abstract Stable AddModifierCard(ModifierCard modifierCard, Player player);

    public Stable AddModifierCards(List<ModifierCard> modifierCards, Player player) {
        for (ModifierCard modifierCard : modifierCards)
            AddModifierCard(modifierCard, player);
        return this;
    }

    // /**
    //  * Adds a List of Cards to the Stable.
    //  * @param cards Cards to be added to the Stable.
    //  * @param player Player to act upon if the Card has an OnEnterStable Action.
    //  * @return A reference to the Stable.
    //  * @throws InvalidParameterException Card type must be Modifier or Unicorn.
    //  */
    // public Stable AddCards(List<Card> cards, Player player) throws InvalidParameterException {
    //     for (Card card : cards)
    //         AddCard(card, player);

    //     return this;
    // }

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

    public abstract void RemoveModifierCard(int index);

    public abstract void RemoveModifierCards(int startIndex, int endIndex);

    public abstract void ClearModifierCards();

    public abstract void RemoveUnicornCard(int index);

    public abstract void RemoveUnicornCards(int startIndex, int endIndex);

    public abstract void ClearUnicornCards();

    public void ClearAllCards() {
        ClearModifierCards();
        ClearUnicornCards();
    }
}
