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
            public final CardAction enterStable; // When the card is entered into the player's stable.
            public final CardAction inStable; // When the card is already in a player's stable;
            public final CardAction onPlay; // When the card is played by the player.
            public final int weight; // How many unicorns a card is worth towards the unicorn total.
            public final boolean immortal; // If the card is sacrificed or discarded, it is returned to the player's hand.
            public final boolean magicProof; // The card cannot be sacrificed or destroyed by magic.
        
            private MagicUnicornCard(String name, CardAction enterStable, CardAction inStable, CardAction onPlay, int weight, boolean immortal, boolean magicProof) {
                super(name, UnicornType.Magic);
                this.enterStable = enterStable;
                this.inStable = inStable;
                this.onPlay = onPlay;
                this.weight = weight;
                this.immortal = immortal;
                this.magicProof = magicProof;
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
        public final CardAction cardAction;

        private MagicCard(String name, CardAction cardAction) {
            super(name, CardArchetype.Magic);
            this.cardAction = cardAction;
        }
    }

    public static class ModifierCard extends Card {
        public enum ModifierType {
            Upgrade,
            Downgrade
        }
        
        public final CardAction cardAction;
        public final ModifierType modifierType;

        private ModifierCard(String name, CardAction cardAction, ModifierType modifierType) {
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
        private String name = "";
        private CardAction enterStable = null;
        private CardAction inStable = null;
        private CardAction onPlay = null;
        private int weight = 1;
        private boolean immortal = false;
        private boolean magicProof = false;

        public MagicUnicornCardBuilder SetEnterStableAction(CardAction enterStable) {
            this.enterStable = enterStable;
            return this;
        }

        public MagicUnicornCardBuilder SetInStableAction(CardAction inStable) {
            this.inStable = inStable;
            return this;
        }

        public MagicUnicornCardBuilder SetOnPlayAction(CardAction onPlay) {
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

        public MagicUnicornCardBuilder SetImmortal(boolean immortal) {
            this.immortal = immortal;
            return this;
        }

        public MagicUnicornCardBuilder SetMagicProof(boolean magicProof) {
            this.magicProof = magicProof;
            return this;
        }

        public Card Build() {
            return new UnicornCard.MagicUnicornCard(name, enterStable, inStable, onPlay, weight, immortal, magicProof);
        }
    }

    public static Card CreateBabyUnicornCard(String name) {
        return new UnicornCard(name, UnicornCard.UnicornType.Baby);
    }
    
    public static Card CreateBasicUnicornCard(String name) {
        return new UnicornCard(name, UnicornCard.UnicornType.Basic);
    }

    public static Card CreateMagicCard(String name, CardAction cardAction) {
        return new MagicCard(name, cardAction);
    }

    public static Card CreateUpgradeCard(String name, CardAction cardAction) {
        return new ModifierCard(name, cardAction, ModifierCard.ModifierType.Upgrade);
    }

    public static Card CreateDowngradeCard(String name, CardAction cardAction) {
        return new ModifierCard(name, cardAction, ModifierCard.ModifierType.Downgrade);
    }

    public static Card CreateNeighCard(String name, boolean isSuperNeigh) {
        return new NeighCard(name, isSuperNeigh);
    }
};