package Game.Cards;

/**
 * Represents a Downgrade or Upgrade Card, can modify player state when in a Stable.
 */
public class ModifierCard extends Card {
    /**
     * Helps construct an instance of a ModifierCard.
     */
    public static class ModifierCardBuilder {
        /**
         * Name of the Card being built.
         */
        protected String name;

        /**
         * Path to an Image representing a Card being built.
         */
        protected String imageFileName;

        /**
         * ID of the card being built.
         */
        protected int cardID;

        /**
         * Action associated with the ModifierCard entering a Stable.
         */
        protected CardAction onEnterStable = null;

        /**
         * Action associated with the ModifierCard exiting a Stable.
         */
        protected CardAction onExitStable = null;

        /**
         * Action associated with the ModifierCard being in a Stable.
         */
        protected CardAction inStable = null;
        
        /**
         * Action associated with the ModifierCard being sacrificed.
         */
        protected CardAction onSacrifice = null;

        /**
         * Helps build an instance of a Magic Unicorn Card. Required items for a Modifier Card are the parameters.
         * @param name Name of the Card.
         * @param imageFileName Path to an image representing the Card.
         * @param cardID ID of the Card.
         */
        public ModifierCardBuilder(String name, String imageFileName, int cardID) {
            this.name = name;
            this.imageFileName = imageFileName;
            this.cardID = cardID;
        }

        /**
         * Sets the action associated with entering a Stable.
         * @param onEnterStable The CardAction associated with entering a Stable.
         * @return A reference to the ModifierCardBuilder.
         */
        public ModifierCardBuilder SetOnEnterStable(CardAction onEnterStable) {
            this.onEnterStable = onEnterStable;
            return this;
        }

        /**
         * Sets the action associated with exiting a Stable.
         * @param onExitStable The CardAction associated with exiting a Stable.
         * @return A reference to the ModifierCardBuilder.
         */
        public ModifierCardBuilder SetOnExitStable(CardAction onExitStable) {
            this.onExitStable = onExitStable;
            return this;
        }
        
        /**
         * Sets the action associated with being in a Stable.
         * @param inStable The CardAction associated with being in a Stable.
         * @return A reference to the ModifierCardBuilder.
         */
        public ModifierCardBuilder SetInStable(CardAction inStable) {
            this.inStable = inStable;
            return this;
        }

        /**
         * Sets the action associated with being Sacrificed.
         * @param onSacrifice The CardAction associated with being Sacrificed.
         * @return A reference to the ModifierCardBuilder.
         */
        public ModifierCardBuilder SetOnSacrifice(CardAction onSacrifice) {
            this.onSacrifice = onSacrifice;
            return this;
        }

        /**
         * Builds the ModifierCard.
         * @return A reference to the built ModifierCard.
         */
        public ModifierCard Build() {
            return new ModifierCard(name, imageFileName, cardID, onEnterStable, onExitStable, inStable, onSacrifice);
        }
    }

    /**
     * The action associated with entering a Stable.
     */
    public final CardAction onEnterStable;

    /**
     * The action associated with exiting a Stable.
     */
    public final CardAction onExitStable;
    
    /**
     * The action associated with being in a Stable.
     */
    public final CardAction inStable;
    
    /**
     * The action associated with being sacrificed.
     */
    public final CardAction onSacrifice;
    
    /**
     * Constructs a Card representing a MagicUnicornCard.
     * @param name Name of the Card.
     * @param imageFileName Path to an Image representing the ModifierCard.
     * @param cardID ID of the Card.
     * @param onEnterStable Action that triggers when the ModifierCard enters a stable.
     * @param onExitStable Action that triggers when the ModifierCard exits a stable.
     * @param inStable Action that triggers when the ModifierCard is in a stable.
     * @param onSacrifice Action that triggers when the ModifierCard is sacrificed.
     */
    protected ModifierCard(String name, String imageFileName, int cardID, CardAction onEnterStable, CardAction onExitStable, 
        CardAction inStable, CardAction onSacrifice) 
    {
        super(name, imageFileName, cardID);
        this.onEnterStable = onEnterStable;
        this.onExitStable = onExitStable;
        this.inStable = inStable;
        this.onSacrifice = onSacrifice;
    }
}