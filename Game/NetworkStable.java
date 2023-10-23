package Game;

import java.util.List;

import Game.Cards.ModifierCard;
import Game.Cards.Unicorn;

public class NetworkStable extends Stable {
    public NetworkStable AddModifierCard(ModifierCard modifierCard, Player player) {
        modifiers.add(modifierCard);
        return this;
    }

    @Override
    public NetworkStable AddModifierCards(List<ModifierCard> modiferCards, Player player) {
        modifiers.addAll(modiferCards);
        return this;
    }

    public NetworkStable AddUnicornCard(Unicorn unicornCard, Player player) {
        unicorns.add(unicornCard);
        return this;
    }

    @Override
    public NetworkStable AddUnicornCards(List<Unicorn> unicornCards, Player player) {
        unicorns.addAll(unicornCards);
        return this;
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
