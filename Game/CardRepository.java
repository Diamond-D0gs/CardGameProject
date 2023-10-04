package Game;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import Game.Cards.MagicUnicornCard.MagicUnicornBuilder;
import Game.Cards.BabyUnicornCard;
import Game.Cards.Card;
import Game.Cards.CardActions.CardAction;
import Game.Cards.CardActions.CardActionsBuilder;

/**
 * Stores the original instance of each card, translates Card IDs into Card objects.
 */
public class CardRepository {
    private static CardRepository cardRepository = null;

    private ArrayList<Card> cards;
    private ArrayList<Integer> deck;
    private ArrayList<Integer> nursery;

    /**
     * Creates all the instances of Baby Unicorn Cards.
     * @return A list of Baby Unicorn Cards.
     */
    private static List<Card> CreateBabyUnicornCards() {
        var array = new ArrayList<Card>();
        
        array.add(new BabyUnicornCard("Baby Narwhal", null));
        array.add(new BabyUnicornCard("Baby Unicorn (Black)", null));
        array.add(new BabyUnicornCard("Baby Unicorn (Blue)", null));
        array.add(new BabyUnicornCard("Baby Unicorn (Brown)", null));
        array.add(new BabyUnicornCard("Baby Unicorn (Death)", null));
        array.add(new BabyUnicornCard("Baby Unicorn (Green)", null));
        array.add(new BabyUnicornCard("Baby Unicorn (Orange)", null));
        array.add(new BabyUnicornCard("Baby Unicorn (Pink)", null));
        array.add(new BabyUnicornCard("Baby Unicorn (Purple)", null));
        array.add(new BabyUnicornCard("Baby Unicorn (Rainbow)", null));
        array.add(new BabyUnicornCard("Baby Unicorn (Red)", null));
        array.add(new BabyUnicornCard("Baby Unicorn (Yellow)", null));
        array.add(new BabyUnicornCard("Baby Unicorn (White)", null));
        
        return array;
    }

    /**
     * Creates all the instances of Magic Unicorn Cards.
     * @return A list of Magic Unicorn Cards.
     */
    private static List<Card> CreateMagicUnicornCards() {
        var array = new ArrayList<Card>();
        
        array.add(new MagicUnicornBuilder("Alluring Narwhal", null)
            .SetCardActions(new CardActionsBuilder()
                .SetOnEnterStable(new CardAction(false, (Player player) -> {
                    return;
                })).Build()
            ).Build());
        array.add(new MagicUnicornBuilder("Americorn", null)
            .SetCardActions(new CardActionsBuilder()
                .SetOnEnterStable(new CardAction(true, (Player player) -> {
                    return;
                })).Build()
            ).Build());
        array.add(new MagicUnicornBuilder("Annoying Flying Unicorn", null)
            .SetIsImmortal(true)
            .SetCardActions(new CardActionsBuilder()
                .SetOnEnterStable(new CardAction(true, (Player player) -> {
                    return;
                })).Build()
            ).Build());
        array.add(new MagicUnicornBuilder("Black Knight Unicorn", null)
            .SetCanMartyr(true)
            .Build());
        array.add(new MagicUnicornBuilder("Chainsaw Unicorn", null)
            .SetCardActions(new CardActionsBuilder()
                .SetOnEnterStable(new CardAction(true, (Player player) -> {
                    return;
                })).Build()
            ).Build());
        array.add(new MagicUnicornBuilder("Classy Narwhal", null)
            .SetCardActions(new CardActionsBuilder()
                .SetOnEnterStable(new CardAction(true, (Player player) -> {
                    return;
                })).Build()
            ).Build());
        array.add(new MagicUnicornBuilder("Dark Angel Unicorn", null)
            .SetCardActions(new CardActionsBuilder()
                .SetOnEnterStable(new CardAction(true, (Player player) -> {
                    return;
                })).Build()
            ).Build());
        array.add(new MagicUnicornBuilder("Extremely Destructive Unicorn", null)
            .SetCardActions(new CardActionsBuilder()
                .SetOnEnterStable(new CardAction(false, (Player player) -> {
                    return;
                })).Build()
            ).Build());
        array.add(new MagicUnicornBuilder("Ginormous Unicorn", null)
            .SetWeight(2)
            .SetCardActions(new CardActionsBuilder()
                .SetOnEnterStable(new CardAction(false, (Player player) -> {
                    return;
                }))
                .SetOnExitStable(new CardAction(false, (Player player) -> {
                    return;
                })).Build()
            ).Build());
        array.add(new MagicUnicornBuilder("Greedy Flying Unicorn", null)
            .SetIsImmortal(true)
            .SetCardActions(new CardActionsBuilder()
                .SetOnEnterStable(new CardAction(false, (Player player) -> {
                    return;
                })).Build()
            ).Build());
        array.add(new MagicUnicornBuilder("Llamacorn", null)
            .SetCardActions(new CardActionsBuilder()
                .SetOnEnterStable(new CardAction(false, (Player player) -> {
                    return;
                })).Build()
            ).Build());
        array.add(new MagicUnicornBuilder("Magical Flying Unicorn", null)
            .SetIsImmortal(true)
            .SetCardActions(new CardActionsBuilder()
                .SetOnEnterStable(new CardAction(true, (Player player) -> {
                    return;
                })).Build()
            ).Build());
        array.add(new MagicUnicornBuilder("Magical Kittencorn", null)
            .SetIsMagicProof(true)
            .Build());
        array.add(new MagicUnicornBuilder("Majestic Flying Unicorn", null)
            .SetIsImmortal(true)
            .SetCardActions(new CardActionsBuilder()
                .SetOnEnterStable(new CardAction(true, (Player player) -> {
                    return;
                })).Build()
            ).Build());
        array.add(new MagicUnicornBuilder("Mermaid Unicorn", null)
            .SetCardActions(new CardActionsBuilder()
                .SetOnEnterStable(new CardAction(false, (Player player) -> {
                    return;
                })).Build()
            ).Build());
        array.add(new MagicUnicornBuilder("Narwhal Torpedo", null)
            .SetCardActions(new CardActionsBuilder()
                .SetOnEnterStable(new CardAction(false, (Player player) -> {
                    return;
                })).Build()
            ).Build());
        array.add(new MagicUnicornBuilder("Rhinocorn", null)
            .SetCardActions(new CardActionsBuilder()
                .SetInStable(new CardAction(true, (Player player) -> {
                    return;
                })).Build()
            ).Build());
        array.add(new MagicUnicornBuilder("Shabby The Narwhal", null)
            .SetCardActions(new CardActionsBuilder()
                .SetOnEnterStable(new CardAction(true, (Player player) -> {
                    return;
                })).Build()
            ).Build());
        array.add(new MagicUnicornBuilder("Shark With A Horn", null)
            .SetCardActions(new CardActionsBuilder()
                .SetOnEnterStable(new CardAction(true, (Player player) -> {
                    return;
                })).Build()
            ).Build());
        array.add(new MagicUnicornBuilder("Stabby The Unicorn", null)
            .SetCardActions(new CardActionsBuilder()
                .SetOnSacrifice(new CardAction(true, (Player player) -> {
                    return;
                })).Build()
            ).Build());
        array.add(new MagicUnicornBuilder("Swift Flying Unicorn", null)
            .SetIsImmortal(true)
            .SetCardActions(new CardActionsBuilder()
                .SetOnEnterStable(new CardAction(true, (Player player) -> {
                    return;
                })).Build()
            ).Build());
        array.add(new MagicUnicornBuilder("The Great Narwhal", null)
            .SetCardActions(new CardActionsBuilder()
                .SetOnEnterStable(new CardAction(true, (Player player) -> {
                    return;
                })).Build()
            ).Build());
        array.add(new MagicUnicornBuilder("Unicorn On The Cob", null)
            .SetCardActions(new CardActionsBuilder()
                .SetOnEnterStable(new CardAction(true, (Player player) -> {
                    return;
                })).Build()
            ).Build());
        array.add(new MagicUnicornBuilder("Unicorn Oracle", null)
            .SetCardActions(new CardActionsBuilder()
                .SetOnEnterStable(new CardAction(false, (Player player) -> {
                    return;
                })).Build()
            ).Build());
        array.add(new MagicUnicornBuilder("Unicorn Phoenix", null)
            .SetIsImmortal(true)
            .Build());
        
        return array;
    }

    /**
     * The constructor.
     */
    private CardRepository() {
        cards = new ArrayList<Card>();
        deck = new ArrayList<Integer>();
        nursery = new ArrayList<Integer>();

        // First Card is the "null card".
        cards.add(null);
        
        // Create the nursery template.
        int offset = cards.size();
        cards.addAll(CreateBabyUnicornCards());
        for (int i = offset; i < cards.size(); ++i)
            nursery.add(i);

        // Create the deck template.
        offset = cards.size();
        cards.addAll(CreateMagicUnicornCards());
        for (int i = offset; i < cards.size(); ++i)
            deck.add(i);
    }

    /**
     * Fetches the existing instance of Card Repository, creates it if it doesn't exist already.
     * @return The instance of Card Repository.
     */
    public static CardRepository GetCardRepository() {
        if (cardRepository == null) // If it doesn't exist yet then instantiate it.
            cardRepository = new CardRepository();
        return cardRepository;
    }

    /**
     * Creates a new nursery that's been shuffled.
     * @return A list of shuffled Baby Unicorn Card IDs.
     */
    public List<Integer> CreateShuffledNursery() {
        var shuffledNursery = new LinkedList<Integer>(nursery);
        Collections.shuffle(shuffledNursery);
        return shuffledNursery;
    }

    /**
     * Creates a new deck that's been shuffled.
     * @return A list of shuffled Card IDs.
     */
    public List<Integer> CreateShuffledDeck() {
        var shuffledDeck = new LinkedList<Integer>(deck);
        Collections.shuffle(shuffledDeck);
        return shuffledDeck;
    }

    /**
     * Turns Card IDs into Card objects.
     * @param cardID The Card ID to decode.
     * @return The Card object associated with the Card ID.
     * @throws IndexOutOfBoundsException Card ID is not within the bounds of the internal Card List.
     */
    public Card DecodeCard(int cardID) throws IndexOutOfBoundsException {
        return cards.get(cardID);
    }
}
