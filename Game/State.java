package Game;

import Game.Cards.Card;

public class State {
    private NetworkHandler networkHandler;
    private CardRepository cardRepository;

    private Player player;
    private Player opponent;

    public State(NetworkHandler networkHandler, CardRepository cardRepository) {
        this.networkHandler = networkHandler;
        this.cardRepository = cardRepository;

        player = new Player();
        opponent = new Player();
    }

    public void StartGame() {
        if (networkHandler.GetStartTime() > networkHandler.GetOpponentStartTime())
    }
}
