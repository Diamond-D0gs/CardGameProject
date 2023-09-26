package Game.Cards;

public class ModifierCard extends Card {
    public enum ModifierType {
        Upgrade,
        Downgrade
    }

    public final ModifierType modifierType;
    public final Action action;

    public ModifierCard(String name, ModifierType modifierType, Action action) {
        super(name, CardArchetype.Modifier);
        this.modifierType = modifierType;
        this.action = action;
    }

    // public static Card CreateUpgradeCard(String name, Action action) {
    //     return new ModifierCard(name, ModifierType.Upgrade, action);
    // }

    // public static Card CreateDowngradeCard(String name, Action action) {
    //     return new ModifierCard(name, ModifierType.Downgrade, action);
    // }
}
