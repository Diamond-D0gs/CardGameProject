package Game;

import java.util.List;

import Game.Cards.Card;
import Game.Cards.ModifierCard;

public class LocalStable extends Stable {
    public LocalStable() {
        super();
    }

    public void RemoveModifierCard(int index) {
        modifiers.remove(index);
    }

    public void RemoveModifierCards(int startIndex, int endIndex) {
        modifiers.removeAll(modifiers.subList(startIndex, endIndex));
    }

    public void ClearModifierCards() {
        modifiers.clear();
    }

    public void RemoveUnicornCard(int index) {
        unicorns.remove(index);
    }

    public void RemoveUnicornCards(int startIndex, int endIndex) {
        unicorns.removeAll(unicorns.subList(startIndex, endIndex));
    }

    public void ClearUnicornCards() {
        unicorns.clear();
    }
}
