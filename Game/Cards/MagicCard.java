package Game.Cards;

import Game.Cards.CardActions.CardAction;

public class MagicCard extends Card {
    public final CardAction onPlay;

    public MagicCard(String name, String imageFileName, CardAction onPlay) {
        super(name, imageFileName);
        this.onPlay = onPlay;
    }
}