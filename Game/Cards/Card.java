package Game.Cards;

public class Card {
    // Enums

    public enum CardArchetype {
        Unicorn,
        Magic,
        Modifier,
        Neigh
    };

    // Card Archetype Classes

    public static class UnicornCard extends Card {
        public enum UnicornType {
            Baby,
            Basic,
            Magic
        }
        
        public static class MagicUnicornCard extends UnicornCard {
            public final Action enterStable; // When the card is entered into the player's stable.
            public final Action inStable; // When the card is already in a player's stable;
            public final Action onPlay; // When the card is played by the player.
            public final int weight;
        
            private MagicUnicornCard(String name, Action enterStable, Action inStable, Action onPlay, int weight) {
                super(name, UnicornType.Magic);
                this.enterStable = enterStable;
                this.inStable = inStable;
                this.onPlay = onPlay;
                this.weight = weight;
            }
        }
    
        public final UnicornType unicornType;
    
        // Do not create a Magic Unicorn Type directly with this constructor, will cause a ClassCastException!
        private UnicornCard(String name, UnicornType unicornType) {
            super(name, CardArchetype.Unicorn);
            this.unicornType = unicornType;
        }
    }

    public static class MagicCard extends Card {
        public final Action cardAction;

        private MagicCard(String name, Action cardAction) {
            super(name, CardArchetype.Magic);
            this.cardAction = cardAction;
        }
    }

    public static class ModifierCard extends Card {
        public enum ModifierType {
            Upgrade,
            Downgrade
        }
        
        public final Action cardAction;
        public final ModifierType modifierType;

        private ModifierCard(String name, Action cardAction, ModifierType modifierType) {
            super(name, CardArchetype.Modifier);
            this.cardAction = cardAction;
            this.modifierType = modifierType;
        } 
    }

    public static class NeighCard extends Card {
        public final boolean isSuperNeigh;
    
        private NeighCard(String name, boolean isSuperNeigh) {
            super(name, CardArchetype.Neigh);
            this.isSuperNeigh = isSuperNeigh;
        }
    }

    // Variables

    public final String name;
    public final CardArchetype cardArchetype;

    // Constructor

    private Card(String name, CardArchetype cardArchetype) {
        this.name = name;
        this.cardArchetype = cardArchetype;
    }

    // Builder & Factory Methods.

    public static class MagicUnicornCardBuilder {
        private Action enterStable = null;
        private Action inStable = null;
        private Action onPlay = null;
        private String name = "";
        private int weight = 1;

        public MagicUnicornCardBuilder SetEnterStableAction(Action enterStable) {
            this.enterStable = enterStable;
            return this;
        }

        public MagicUnicornCardBuilder SetInStableAction(Action inStable) {
            this.inStable = inStable;
            return this;
        }

        public MagicUnicornCardBuilder SetOnPlayAction(Action onPlay) {
            this.onPlay = onPlay;
            return this;
        }

        public MagicUnicornCardBuilder SetName(String name) {
            this.name = name;
            return this;
        }

        public MagicUnicornCardBuilder SetWeight(int weight) {
            this.weight = weight;
            return this;
        }

        public Card Build() {
            return new UnicornCard.MagicUnicornCard(name, enterStable, inStable, onPlay, weight);
        }
    }

    public static Card CreateBabyUnicornCard(String name) {
        return new UnicornCard(name, UnicornCard.UnicornType.Baby);
    }
    
    public static Card CreateBasicUnicornCard(String name) {
        return new UnicornCard(name, UnicornCard.UnicornType.Basic);
    }

    public static Card CreateMagicCard(String name, Action cardAction) {
        return new MagicCard(name, cardAction);
    }

    public static Card CreateUpgradeCard(String name, Action cardAction) {
        return new ModifierCard(name, cardAction, ModifierCard.ModifierType.Upgrade);
    }

    public static Card CreateDowngradeCard(String name, Action cardAction) {
        return new ModifierCard(name, cardAction, ModifierCard.ModifierType.Downgrade);
    }

    public static Card CreateNeighCard(String name, boolean isSuperNeigh) {
        return new NeighCard(name, isSuperNeigh);
    }
};