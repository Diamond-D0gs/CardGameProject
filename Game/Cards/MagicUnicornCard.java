package Game.Cards;

/**
 * A Modifier type card that's also a Unicorn.
 */
public class MagicUnicornCard extends ModifierCard implements Unicorn {
    /**
     * Helps build an instance of a Magic Unicorn Card.
     */
    public static class MagicUnicornBuilder extends ModifierCardBuilder {
        /**
         * The MagicUnicornCard returns to player's hand if Sacrificed or Destroyed instead of going to Discard. Default is false.
         */
        protected boolean isImmortal = false;

        /**
         * The MagicUnicornCard cannot be destroyed by the effects of MagicCards. Default is false.
         */
        protected boolean isMagicProof = false;

        /**
         * The MagicUnicornCard can be sacrificed instead of another MagicUnicornCard. Default is false.
         */
        protected boolean canMartyr = false;

        /**
         * How many Unicorns the MagicUnicornCard is worth. Default is 1.
         */
        protected int weight = 1;
        
        /**
         * Helps build an instance of a Magic Unicorn Card. Required items for a Magic Unicorn Card are the parameters.
         * @param name Name of the Card.
         * @param imageFileName Path to an image representing the Card.
         * @param cardID ID of the Card.
         */
        public MagicUnicornBuilder(String name, String imageFileName, int cardID) {
            super(name, imageFileName, cardID);
        }

        /**
         * Sets if the MagicUnicornCard is immortal.
         * @param isImmortal Indicates if the MagicUnicornCard is immortal.
         * @return A reference to the MagicUnicornBuilder.
         */
        public MagicUnicornBuilder SetIsImmortal(boolean isImmortal) {
            this.isImmortal = isImmortal;
            return this;
        }

        /**
         * Sets if the MagicUnicornCard cannot be destroyed by the effects of MagicCards.
         * @param isMagicProof Indicates if the MagicUnicornCard is magic proof.
         * @return A reference to the MagicUnicornBuilder.
         */
        public MagicUnicornBuilder SetIsMagicProof(boolean isMagicProof) {
            this.isMagicProof = isMagicProof;
            return this;
        }

        /**
         * Sets if the MagicUnicornCard can be sacrificed instead of another MagicUnicornCard.
         * @param canMartyr Indicates if the MagicUnicornCard can martyr.
         * @return A reference to the MagicUnicornBuilder.
         */
        public MagicUnicornBuilder SetCanMartyr(boolean canMartyr) {
            this.canMartyr = canMartyr;
            return this;
        }

        /**
         * Sets how many Unicorns a MagicUnicornCard is worth.
         * @param weight How many Unicorns a MagicUnicornCard is worth.
         * @return A reference to the MagicUnicornBuilder.
         */
        public MagicUnicornBuilder SetWeight(int weight) {
            this.weight = weight;
            return this;
        }

        public MagicUnicornCard Build() {
            return new MagicUnicornCard(name, imageFileName, cardID, onEnterStable, onExitStable, inStable, onSacrifice, isImmortal, isMagicProof, canMartyr, weight);
        }
    }
    
    /**
     * The MagicUnicornCard returns to player's hand if Sacrificed or Destroyed instead of going to Discard.
     */
    public final boolean isImmortal;

    /**MagicUnicorn
     * The MagicUnicornCard cannot be destroyed by the effects of MagicCards.
     */
    public final boolean isMagicProof;

    /**
     * The MagicUnicornCard can be sacrificed instead of another MagicUnicornCard.
     */
    public final boolean canMartyr;

    /**
     * How many Unicorns the MagicUnicornCard is worth.
     */
    public final int weight;

    /**
     * Constructs a Card representing a MagicUnicornCard.
     * @param name Name of the Card.
     * @param imageFileName Path to an Image representing the MagicUnicornCard.
     * @param cardID ID of the Card.
     * @param onEnterStable Action associated with a MagicUnicornCard entering a Stable.
     * @param onExitStable Action associated with a MagicUnicornCard exiting a Stable.
     * @param inStable Action associated with a MagicUnicornCard being in a Stable.
     * @param onSacrifice Action associated with a MagicUnicornCard being Sacrificed.
     * @param isImmortal Flag indicating the MagicUnicornCard returns to player's hand if Sacrificed or Destroyed instead of going to Discard.
     * @param isMagicProof Flag indicating the MagicUnicornCard cannot be destroyed by the effects of MagicCards.
     * @param canMartyr Flag indicating the MagicUnicornCard can be sacrificed instead of another MagicUnicornCard.
     * @param weight Number of how many Unicorns the MagicUnicornCard is worth.
     */
    protected MagicUnicornCard(String name, String imageFileName, int cardID, CardAction onEnterStable, CardAction onExitStable,
        CardAction inStable, CardAction onSacrifice, boolean isImmortal, boolean isMagicProof, boolean canMartyr, int weight) 
    {
        super(name, imageFileName, cardID, onEnterStable, onExitStable, inStable, onSacrifice);
        this.isImmortal = isImmortal;
        this.isMagicProof = isMagicProof;
        this.canMartyr = canMartyr;
        this.weight = weight;
    }
}