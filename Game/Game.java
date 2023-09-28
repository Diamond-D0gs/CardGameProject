package Game;

import java.util.ArrayList;
import java.util.LinkedList;

import Game.Cards.Card;

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
    }

    private void InitializeUnicornCards() {
        var builder = new Card.MagicUnicornCardBuilder();
        deck.add(builder.SetName("Alluring Narwhal").Build());
        deck.add(builder.SetName("Americorn").Build());
        deck.add(builder.SetName("Annoying Flying Unicorn").Build());
        deck.add(builder.SetName("Black Knigh Unicorn").Build());
        deck.add(builder.SetName("Chainsaw Unicorn").Build());
        deck.add(builder.SetName("Classy Narwhal").Build());
        deck.add(builder.SetName("Dark Angel Unicorn").Build());
        deck.add(builder.SetName("Extremely Destructive Unicorn").Build());
        deck.add(builder.SetName("Ginormous Unicorn").SetWeight(2).Build());
    }

    private void InitializeDeck() {

    }

    private void InitializeGame() {
        InitializeNursery();
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
    }
}