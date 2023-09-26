package Game;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

import Game.Cards.Card;

public class Game {
    private static final int NUMBER_OF_PLAYERS = 2;
    private static final int NUMBER_OF_STARTING_CARDS = 6;

    private LinkedList<Card> deck;
    private LinkedList<Card> discard;
    private LinkedList<Card> nursery;
    private ArrayList<Player> players;

    public Game() {
        deck = Card.GenerateDeck();
        nursery = Card.GenerateNursery();
        discard = new LinkedList<Card>();
        players = new ArrayList<Player>(NUMBER_OF_PLAYERS);

        Collections.shuffle(deck);
        Collections.shuffle(nursery);

        for (int i = 0; i < NUMBER_OF_PLAYERS; ++i) {
            var hand = new LinkedList<Card>();
            for (int j = 0; j < NUMBER_OF_STARTING_CARDS; ++j)
                hand.add(deck.pop());

            var stable = new LinkedList<Card>();
            stable.add(nursery.pop());

            players.add(new Player(hand, stable));
        }
    }

    public static void main(String[] args) {
    
    }
}