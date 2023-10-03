import java.util.ArrayList;

import Game.Cards.MagicUnicornCard.MagicUnicornBuilder;
import Game.Player;
import Game.Cards.BabyUnicornCard;
import Game.Cards.Card;
import Game.Cards.CardActions.CardAction;
import Game.Cards.CardActions.CardActionsBuilder;

public class CardRepository {
    private static CardRepository cardRepository = null;

    private ArrayList<Card> cards;

    private static ArrayList<Card> CreateBabyUnicornCards() {
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

    private static ArrayList<Card> CreateMagicUnicornCards() {
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

    private CardRepository() {
        cards = new ArrayList<Card>();
        
    }
}
