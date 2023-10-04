package Game;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

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
    private ArrayList<Card> deck;
    private ArrayList<Card> nursery;

    /**
     * Creates all the instances of Baby Unicorn Cards.
     * @return A list of Baby Unicorn Cards.
     */
    private void CreateBabyUnicornCards() {
        cards.add(new BabyUnicornCard("Baby Narwhal", null, cards.size()));
        cards.add(new BabyUnicornCard("Baby Unicorn (Black)", null, cards.size()));
        cards.add(new BabyUnicornCard("Baby Unicorn (Blue)", null, cards.size()));
        cards.add(new BabyUnicornCard("Baby Unicorn (Brown)", null, cards.size()));
        cards.add(new BabyUnicornCard("Baby Unicorn (Death)", null, cards.size()));
        cards.add(new BabyUnicornCard("Baby Unicorn (Green)", null, cards.size()));
        cards.add(new BabyUnicornCard("Baby Unicorn (Orange)", null, cards.size()));
        cards.add(new BabyUnicornCard("Baby Unicorn (Pink)", null, cards.size()));
        cards.add(new BabyUnicornCard("Baby Unicorn (Purple)", null, cards.size()));
        cards.add(new BabyUnicornCard("Baby Unicorn (Rainbow)", null, cards.size()));
        cards.add(new BabyUnicornCard("Baby Unicorn (Red)", null, cards.size()));
        cards.add(new BabyUnicornCard("Baby Unicorn (Yellow)", null, cards.size()));
        cards.add(new BabyUnicornCard("Baby Unicorn (White)", null, cards.size()));
    }

    /**
     * Creates all the instances of Magic Unicorn Cards.
     * @return A list of Magic Unicorn Cards.
     */
    private void CreateMagicUnicornCards() {
        cards.add(new MagicUnicornBuilder("Alluring Narwhal", null, cards.size())
            .SetCardActions(new CardActionsBuilder()
                .SetOnEnterStable(new CardAction(false, (Player player) -> {
                    return;
                })).Build()
            ).Build());
        cards.add(new MagicUnicornBuilder("Americorn", null, cards.size())
            .SetCardActions(new CardActionsBuilder()
                .SetOnEnterStable(new CardAction(true, (Player player) -> {
                    return;
                })).Build()
            ).Build());
        cards.add(new MagicUnicornBuilder("Annoying Flying Unicorn", null, cards.size())
            .SetIsImmortal(true)
            .SetCardActions(new CardActionsBuilder()
                .SetOnEnterStable(new CardAction(true, (Player player) -> {
                    return;
                })).Build()
            ).Build());
        cards.add(new MagicUnicornBuilder("Black Knight Unicorn", null, cards.size())
            .SetCanMartyr(true)
            .Build());
        cards.add(new MagicUnicornBuilder("Chainsaw Unicorn", null, cards.size())
            .SetCardActions(new CardActionsBuilder()
                .SetOnEnterStable(new CardAction(true, (Player player) -> {
                    return;
                })).Build()
            ).Build());
        cards.add(new MagicUnicornBuilder("Classy Narwhal", null, cards.size())
            .SetCardActions(new CardActionsBuilder()
                .SetOnEnterStable(new CardAction(true, (Player player) -> {
                    return;
                })).Build()
            ).Build());
        cards.add(new MagicUnicornBuilder("Dark Angel Unicorn", null, cards.size())
            .SetCardActions(new CardActionsBuilder()
                .SetOnEnterStable(new CardAction(true, (Player player) -> {
                    return;
                })).Build()
            ).Build());
        cards.add(new MagicUnicornBuilder("Extremely Destructive Unicorn", null, cards.size())
            .SetCardActions(new CardActionsBuilder()
                .SetOnEnterStable(new CardAction(false, (Player player) -> {
                    return;
                })).Build()
            ).Build());
        cards.add(new MagicUnicornBuilder("Ginormous Unicorn", null, cards.size())
            .SetWeight(2)
            .SetCardActions(new CardActionsBuilder()
                .SetOnEnterStable(new CardAction(false, (Player player) -> {
                    return;
                }))
                .SetOnExitStable(new CardAction(false, (Player player) -> {
                    return;
                })).Build()
            ).Build());
        cards.add(new MagicUnicornBuilder("Greedy Flying Unicorn", null, cards.size())
            .SetIsImmortal(true)
            .SetCardActions(new CardActionsBuilder()
                .SetOnEnterStable(new CardAction(false, (Player player) -> {
                    return;
                })).Build()
            ).Build());
        cards.add(new MagicUnicornBuilder("Llamacorn", null, cards.size())
            .SetCardActions(new CardActionsBuilder()
                .SetOnEnterStable(new CardAction(false, (Player player) -> {
                    return;
                })).Build()
            ).Build());
        cards.add(new MagicUnicornBuilder("Magical Flying Unicorn", null, cards.size())
            .SetIsImmortal(true)
            .SetCardActions(new CardActionsBuilder()
                .SetOnEnterStable(new CardAction(true, (Player player) -> {
                    return;
                })).Build()
            ).Build());
        cards.add(new MagicUnicornBuilder("Magical Kittencorn", null, cards.size())
            .SetIsMagicProof(true)
            .Build());
        cards.add(new MagicUnicornBuilder("Majestic Flying Unicorn", null, cards.size())
            .SetIsImmortal(true)
            .SetCardActions(new CardActionsBuilder()
                .SetOnEnterStable(new CardAction(true, (Player player) -> {
                    return;
                })).Build()
            ).Build());
        cards.add(new MagicUnicornBuilder("Mermaid Unicorn", null, cards.size())
            .SetCardActions(new CardActionsBuilder()
                .SetOnEnterStable(new CardAction(false, (Player player) -> {
                    return;
                })).Build()
            ).Build());
        cards.add(new MagicUnicornBuilder("Narwhal Torpedo", null, cards.size())
            .SetCardActions(new CardActionsBuilder()
                .SetOnEnterStable(new CardAction(false, (Player player) -> {
                    return;
                })).Build()
            ).Build());
        cards.add(new MagicUnicornBuilder("Rhinocorn", null, cards.size())
            .SetCardActions(new CardActionsBuilder()
                .SetInStable(new CardAction(true, (Player player) -> {
                    return;
                })).Build()
            ).Build());
        cards.add(new MagicUnicornBuilder("Shabby The Narwhal", null, cards.size())
            .SetCardActions(new CardActionsBuilder()
                .SetOnEnterStable(new CardAction(true, (Player player) -> {
                    return;
                })).Build()
            ).Build());
        cards.add(new MagicUnicornBuilder("Shark With A Horn", null, cards.size())
            .SetCardActions(new CardActionsBuilder()
                .SetOnEnterStable(new CardAction(true, (Player player) -> {
                    return;
                })).Build()
            ).Build());
        cards.add(new MagicUnicornBuilder("Stabby The Unicorn", null, cards.size())
            .SetCardActions(new CardActionsBuilder()
                .SetOnSacrifice(new CardAction(true, (Player player) -> {
                    return;
                })).Build()
            ).Build());
        cards.add(new MagicUnicornBuilder("Swift Flying Unicorn", null, cards.size())
            .SetIsImmortal(true)
            .SetCardActions(new CardActionsBuilder()
                .SetOnEnterStable(new CardAction(true, (Player player) -> {
                    return;
                })).Build()
            ).Build());
        cards.add(new MagicUnicornBuilder("The Great Narwhal", null, cards.size())
            .SetCardActions(new CardActionsBuilder()
                .SetOnEnterStable(new CardAction(true, (Player player) -> {
                    return;
                })).Build()
            ).Build());
        cards.add(new MagicUnicornBuilder("Unicorn On The Cob", null, cards.size())
            .SetCardActions(new CardActionsBuilder()
                .SetOnEnterStable(new CardAction(true, (Player player) -> {
                    return;
                })).Build()
            ).Build());
        cards.add(new MagicUnicornBuilder("Unicorn Oracle", null, cards.size())
            .SetCardActions(new CardActionsBuilder()
                .SetOnEnterStable(new CardAction(false, (Player player) -> {
                    return;
                })).Build()
            ).Build());
        cards.add(new MagicUnicornBuilder("Unicorn Phoenix", null, cards.size())
            .SetIsImmortal(true)
            .Build());
    }

    /**
     * The constructor.
     */
    private CardRepository() {
        cards = new ArrayList<Card>();

        // First Card is the "null card".
        cards.add(null);

        // Create the nursery template.
        int offset = cards.size();
        CreateBabyUnicornCards();
        nursery = new ArrayList<Card>(cards.subList(offset, cards.size()));

        // Create the deck template.
        offset = cards.size();
        CreateMagicUnicornCards();
        deck = new ArrayList<Card>(cards.subList(offset, cards.size()));
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
     * @param seed Randomization seed for shuffle.
     * @return A list of shuffled Baby Unicorn Cards.
     */
    public List<Card> CreateShuffledNursery(long seed) {
        var shuffledNursery = new LinkedList<Card>(nursery);
        // Random is guaranteed to be consistent, given the same seed, across all JVM versions since Java 8.
        Collections.shuffle(shuffledNursery, new Random(seed));
        return shuffledNursery;
    }

    /**
     * Creates a new deck that's been shuffled.
     * @param seed Randomization seed for shuffle.
     * @return A list of shuffled Cards.
     */
    public List<Card> CreateShuffledDeck(long seed) {
        var shuffledDeck = new LinkedList<Card>(deck);
        // Random is guaranteed to be consistent, given the same seed, across all JVM versions since Java 8.
        Collections.shuffle(shuffledDeck, new Random(seed));
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
