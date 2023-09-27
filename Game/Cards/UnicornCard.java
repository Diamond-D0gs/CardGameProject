package Game.Cards;

public class UnicornCard extends Card {
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

        public static class MagicUnicornBuilder {
            private Action enterStable = null;
            private Action inStable = null;
            private Action onPlay = null;
            private String name = "";
            private int weight = 1;

            public MagicUnicornBuilder SetEnterStableAction(Action enterStable) {
                this.enterStable = enterStable;
                return this;
            }

            public MagicUnicornBuilder SetInStableAction(Action inStable) {
                this.inStable = inStable;
                return this;
            }

            public MagicUnicornBuilder SetOnPlayAction(Action onPlay) {
                this.onPlay = onPlay;
                return this;
            }

            public MagicUnicornBuilder SetName(String name) {
                this.name = name;
                return this;
            }

            public MagicUnicornBuilder SetWeight(int weight) {
                this.weight = weight;
                return this;
            }

            public Card Build() {
                return new MagicUnicornCard(name, enterStable, inStable, onPlay, weight);
            }
        }
    }
    
    public enum UnicornType {
        Baby,
        Basic,
        Magic
    }

    public final UnicornType unicornType;

    // Do not create a Magic Unicorn Type directly with this constructor, will cause a ClassCastException!
    private UnicornCard(String name, UnicornType unicornType) {
        super(name, CardArchetype.Unicorn);
        this.unicornType = unicornType;
    }

    public static Card CreateBabyUnicornCard(String name) {
        return new UnicornCard(name, UnicornType.Baby);
    }

    public static Card CreateBasicUnicornCard(String name) {
        return new UnicornCard(name, UnicornType.Basic);
    }
}
