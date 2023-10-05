package Game;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import Game.Cards.MagicUnicornCard.MagicUnicornBuilder;
import Game.Cards.BabyUnicornCard;
import Game.Cards.Card;
import Game.Cards.CardAction;

/**
 * Responsible for the creation of Cards, the assignment of their IDs, their storage, & decoding of IDs back into Card objects.
 */
public class CardRepository {
    /**
     * Reference to the sole CardRepository instance.
     */
    private static CardRepository cardRepository = null;

    /**
     * The List of all Cards in the game. IDs are just indices into this List.
     */
    private ArrayList<Card> cards;

    /**
     * Where the BabyUnicornCards begin in cards.
     */
    private int nurseryOffset;

    /**
     * Where the BabyUnicornCards end & the rest of the deck begins in cards.
     */
    private int deckOffset;

    /**
     * Creates all the instances of BabyUnicornCards & adds them to cards.
     * @return A list of BabyUnicornCards.
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
     * Creates all the instances of MagicUnicornCards & adds them to cards.
     * @return A list of MagicUnicornCards.
     */
    private void CreateMagicUnicornCards() {
        cards.add(new MagicUnicornBuilder("Alluring Narwhal", null, cards.size())
            .SetOnEnterStable(new CardAction(false, (Player player) -> {
                    return;
            }))
            .Build());
        cards.add(new MagicUnicornBuilder("Americorn", null, cards.size())
            .SetOnEnterStable(new CardAction(true, (Player player) -> {
                    return;
            }))
            .Build());
        cards.add(new MagicUnicornBuilder("Annoying Flying Unicorn", null, cards.size())
            .SetIsImmortal(true)
            .SetOnEnterStable(new CardAction(true, (Player player) -> {
                return;
            }))
            .Build());
        cards.add(new MagicUnicornBuilder("Black Knight Unicorn", null, cards.size())
            .SetCanMartyr(true)
            .Build());
        cards.add(new MagicUnicornBuilder("Chainsaw Unicorn", null, cards.size())
            .SetOnEnterStable(new CardAction(true, (Player player) -> {
                return;
            }))
            .Build());
        cards.add(new MagicUnicornBuilder("Classy Narwhal", null, cards.size())
            .SetOnEnterStable(new CardAction(true, (Player player) -> {
                return;
            }))
            .Build());
        cards.add(new MagicUnicornBuilder("Dark Angel Unicorn", null, cards.size())
            .SetOnEnterStable(new CardAction(true, (Player player) -> {
                return;
            }))
            .Build());
        cards.add(new MagicUnicornBuilder("Extremely Destructive Unicorn", null, cards.size())
            .SetOnEnterStable(new CardAction(false, (Player player) -> {
                return;
            }))
            .Build());
        cards.add(new MagicUnicornBuilder("Ginormous Unicorn", null, cards.size())
            .SetWeight(2)
            .SetOnEnterStable(new CardAction(false, (Player player) -> {
                return;
            }))
            .SetOnExitStable(new CardAction(false, (Player player) -> {
                return;
            }))
            .Build());
        cards.add(new MagicUnicornBuilder("Greedy Flying Unicorn", null, cards.size())
            .SetIsImmortal(true)
            .SetOnEnterStable(new CardAction(false, (Player player) -> {
                return;
            }))
            .Build());
        cards.add(new MagicUnicornBuilder("Llamacorn", null, cards.size())
            .SetOnEnterStable(new CardAction(false, (Player player) -> {
                return;
            }))
            .Build());
        cards.add(new MagicUnicornBuilder("Magical Flying Unicorn", null, cards.size())
            .SetIsImmortal(true)
            .SetOnEnterStable(new CardAction(true, (Player player) -> {
                return;
            }))
            .Build());
        cards.add(new MagicUnicornBuilder("Magical Kittencorn", null, cards.size())
            .SetIsMagicProof(true)
            .Build());
        cards.add(new MagicUnicornBuilder("Majestic Flying Unicorn", null, cards.size())
            .SetIsImmortal(true)
            .SetOnEnterStable(new CardAction(true, (Player player) -> {
                return;
            }))
            .Build());
        cards.add(new MagicUnicornBuilder("Mermaid Unicorn", null, cards.size())
            .SetOnEnterStable(new CardAction(true, (Player player) -> {
                return;
            }))
            .Build());
        cards.add(new MagicUnicornBuilder("Narwhal Torpedo", null, cards.size())
            .SetOnEnterStable(new CardAction(false, (Player player) -> {
                return;
            }))
            .Build());
        cards.add(new MagicUnicornBuilder("Rhinocorn", null, cards.size())
            .SetInStable(new CardAction(true, (Player player) -> {
                return;
            }))
            .Build());
        cards.add(new MagicUnicornBuilder("Shabby The Narwhal", null, cards.size())
            .SetOnEnterStable(new CardAction(true, (Player player) -> {
                return;
            }))
            .Build());
        cards.add(new MagicUnicornBuilder("Shark With A Horn", null, cards.size())
            .SetOnEnterStable(new CardAction(true, (Player player) -> {
                return;
            }))
            .Build());
        cards.add(new MagicUnicornBuilder("Stabby The Unicorn", null, cards.size())
            .SetOnSacrifice(new CardAction(true, (Player player) -> {
                return;
            }))
            .Build());
        cards.add(new MagicUnicornBuilder("Swift Flying Unicorn", null, cards.size())
            .SetIsImmortal(true)
            .SetOnEnterStable(new CardAction(true, (Player player) -> {
                return;
            }))
            .Build());
        cards.add(new MagicUnicornBuilder("The Great Narwhal", null, cards.size())
            .SetOnEnterStable(new CardAction(true, (Player player) -> {
                return;
            }))
            .Build());
        cards.add(new MagicUnicornBuilder("Unicorn On The Cob", null, cards.size())
            .SetOnEnterStable(new CardAction(true, (Player player) -> {
                return;
            }))
            .Build());
        cards.add(new MagicUnicornBuilder("Unicorn Oracle", null, cards.size())
            .SetOnEnterStable(new CardAction(false, (Player player) -> {
                return;
            }))
            .Build());
        cards.add(new MagicUnicornBuilder("Unicorn Phoenix", null, cards.size())
            .SetIsImmortal(true)
            .Build());
    }

    /**
     * Constructs an instance of CardRepository.
     */
    private CardRepository() {
        cards = new ArrayList<Card>();

        // First Card, Card ID 0, is the "null Card".
        cards.add(null);

        // Get nursery offset & populate cards w/ BabyUnicornCards.
        nurseryOffset = cards.size();
        CreateBabyUnicornCards();

        // Get deck offset & populate cards w/ the other Card types.
        deckOffset = cards.size();
        CreateMagicUnicornCards();
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
        // nurseryOffset excludes the null Card & deckOffset excludes non-baby Cards.
        var shuffledNursery = cards.subList(nurseryOffset, deckOffset);
        // Random is guaranteed to be consistent, given the same seed, across all JVM versions since Java 8.
        Collections.shuffle(shuffledNursery, new Random(seed));
        return new LinkedList<Card>(shuffledNursery);
    }

    /**
     * Creates a new deck that's been shuffled.
     * @param seed Randomization seed for shuffle.
     * @return A list of shuffled Cards.
     */
    public List<Card> CreateShuffledDeck(long seed) {
        // deckOffset excludes null Card & baby Cards.
        var shuffledDeck = cards.subList(deckOffset, cards.size());
        // Random is guaranteed to be consistent, given the same seed, across all JVM versions since Java 8.
        Collections.shuffle(shuffledDeck, new Random(seed));
        return new LinkedList<Card>(shuffledDeck);
    }

    /**
     * Translates Card IDs into Card objects.
     * @param cardID The Card ID to decode.
     * @return The Card object associated with the Card ID.
     * @throws IndexOutOfBoundsException Card ID is not within the bounds of the internal Card List.
     */
    public Card DecodeCard(int cardID) throws IndexOutOfBoundsException {
        return cards.get(cardID);
    }
}
