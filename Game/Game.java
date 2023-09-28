package Game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

import Game.Cards.Card;
import Game.Cards.CardAction;
import Game.Cards.Card.UnicornCard.MagicUnicornCard;

public class Game {
    private static final int NUMBER_OF_PLAYERS = 2;
    private static final int NUMBER_OF_STARTING_CARDS = 6;

    private LinkedList<Card> deck;
    private LinkedList<Card> discard;
    private LinkedList<Card> nursery;
    private ArrayList<Player> players;

    private void InitializeNursery() {
        nursery.add(Card.CreateBabyUnicornCard("Baby Narwhal"));
        nursery.add(Card.CreateBabyUnicornCard("Baby Unicorn (Black)"));
        nursery.add(Card.CreateBabyUnicornCard("Baby Unicorn (Blue)"));
        nursery.add(Card.CreateBabyUnicornCard("Baby Unicorn (Brown)"));
        nursery.add(Card.CreateBabyUnicornCard("Baby Unicorn (Death)"));
        nursery.add(Card.CreateBabyUnicornCard("Baby Unicorn (Green)"));
        nursery.add(Card.CreateBabyUnicornCard("Baby Unicorn (Orange)"));
        nursery.add(Card.CreateBabyUnicornCard("Baby Unicorn (Pink)"));
        nursery.add(Card.CreateBabyUnicornCard("Baby Unicorn (Purple)"));
        nursery.add(Card.CreateBabyUnicornCard("Baby Unicorn (Rainbow)"));
        nursery.add(Card.CreateBabyUnicornCard("Baby Unicorn (Red)"));
        nursery.add(Card.CreateBabyUnicornCard("Baby Unicorn (Yellow)"));
        nursery.add(Card.CreateBabyUnicornCard("Baby Unicorn (White)"));
        Collections.shuffle(nursery);
    }

    private void InitializeUnicornCards() {
        deck.add((new Card.MagicUnicornCardBuilder())
            .SetName("Alluring Narwhal")
            .SetOnPlayAction(new CardAction(true, (Turn turn) -> {
                System.out.println("Joe Biden Wake Up!");
            }))
            .Build());
        deck.add((new Card.MagicUnicornCardBuilder())
            .SetName("Americorn")
            .Build());
        deck.add((new Card.MagicUnicornCardBuilder())
            .SetName("Annoying Flying Unicorn")
            .SetImmortal(true)
            .Build());
        deck.add((new Card.MagicUnicornCardBuilder())
            .SetName("Black Knight Unicorn")
            .Build());
        deck.add((new Card.MagicUnicornCardBuilder())
            .SetName("Chainsaw Unicorn")
            .Build());
        deck.add((new Card.MagicUnicornCardBuilder())
            .SetName("Classy Narwhal")
            .Build());
        deck.add((new Card.MagicUnicornCardBuilder())
            .SetName("Dark Angel Unicorn")
            .Build());
        deck.add((new Card.MagicUnicornCardBuilder())
            .SetName("Extremely Destructive Unicorn")
            .Build());
        deck.add((new Card.MagicUnicornCardBuilder())
            .SetName("Ginormous Unicorn")
            .SetWeight(2)
            .Build());
        deck.add((new Card.MagicUnicornCardBuilder())
            .SetName("Greedy Flying Unicorn")
            .SetImmortal(true)
            .Build());
        deck.add((new Card.MagicUnicornCardBuilder())
            .SetName("Llamacorn")
            .Build());
        deck.add((new Card.MagicUnicornCardBuilder())
            .SetName("Magical Flying Unicorn")
            .SetImmortal(true)
            .Build());
        deck.add((new Card.MagicUnicornCardBuilder())
            .SetName("Magic Kittencorn")
            .SetMagicProof(true)
            .Build());
        deck.add((new Card.MagicUnicornCardBuilder())
            .SetName("Majestic Flying Unicorn")
            .SetImmortal(true)
            .Build());
        deck.add((new Card.MagicUnicornCardBuilder())
            .SetName("Mermaid Unicorn")
            .Build());
        deck.add((new Card.MagicUnicornCardBuilder())
            .SetName("Narwhal Torpedo")
            .Build());
        deck.add((new Card.MagicUnicornCardBuilder())
            .SetName("Rhinocorn")
            .Build());
        deck.add((new Card.MagicUnicornCardBuilder())
            .SetName("Shabby The Narwhal")
            .Build());
        deck.add((new Card.MagicUnicornCardBuilder())
            .SetName("Shark With A Horn")
            .Build());
        deck.add((new Card.MagicUnicornCardBuilder())
            .SetName("Stabby The Unicorn")
            .Build());
        deck.add((new Card.MagicUnicornCardBuilder())
            .SetName("Swift Flying Unicorn")
            .SetImmortal(true)
            .Build());
        deck.add((new Card.MagicUnicornCardBuilder())
            .SetName("The Great Narwhal")
            .Build());
        deck.add((new Card.MagicUnicornCardBuilder())
            .SetName("Unicorn On The Cob")
            .Build());
        deck.add((new Card.MagicUnicornCardBuilder())
            .SetName("Unicorn Oracle")
            .Build());
        deck.add((new Card.MagicUnicornCardBuilder())
            .SetName("Unicorn Phoenix")
            .SetImmortal(true)
            .Build());
    }

    private void InitializeDeck() {
        InitializeUnicornCards();
        Collections.shuffle(deck);
    }

    private void InitializeGame() {
        InitializeNursery();
        InitializeDeck();
    }

    public void ListNurseryContents() {
        for (var card : nursery)
            System.out.println(card.name);
    }

    public void ListDeckContents() {
        for (var card : deck)
            System.out.println(card.name);
    }

    Game() {
        deck = new LinkedList<>();
        discard = new LinkedList<>();
        nursery = new LinkedList<>();
        players = new ArrayList<>(NUMBER_OF_PLAYERS);

        InitializeGame();
    }

    public static void main(String[] args) {
        var game = new Game();
        game.ListNurseryContents();
        game.ListDeckContents();
    }
}