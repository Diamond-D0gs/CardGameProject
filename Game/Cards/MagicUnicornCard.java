package Game.Cards;

public class MagicUnicornCard extends UnicornCard {
    public static class MagicUnicornBuilder {
        private String name;
        private String imageFileName;
        private int cardID;
        private boolean isImmortal = false;
        private boolean isMagicProof = false;
        private boolean canMartyr = false;
        private int weight = 1;
        private CardActions cardActions = null;
        
        public MagicUnicornBuilder(String name, String imageFileName, int cardID) {
            this.name = name;
            this.imageFileName = imageFileName;
            this.cardID = cardID;
        }

        public MagicUnicornBuilder SetIsImmortal(boolean isImmortal) {
            this.isImmortal = isImmortal;
            return this;
        }

        public MagicUnicornBuilder SetIsMagicProof(boolean isMagicProof) {
            this.isMagicProof = isMagicProof;
            return this;
        }

        public MagicUnicornBuilder SetCanMartyr(boolean canMartyr) {
            this.canMartyr = canMartyr;
            return this;
        }

        public MagicUnicornBuilder SetWeight(int weight) {
            this.weight = weight;
            return this;
        }

        public MagicUnicornBuilder SetCardActions(CardActions cardActions) {
            this.cardActions = cardActions;
            return this;
        }

        public MagicUnicornCard Build() {
            return new MagicUnicornCard(name, imageFileName, cardID, cardActions, isImmortal, isMagicProof, canMartyr, weight);
        }
    }
    
    public final CardActions cardActions;
    public final boolean isImmortal;
    public final boolean isMagicProof;
    public final boolean canMartyr;
    public final int weight;

    private MagicUnicornCard(String name, String imageFileName, int cardID, CardActions cardActions, boolean isImmortal, boolean isMagicProof, boolean canMartyr, int weight) {
        super(name, imageFileName, cardID);
        this.cardActions = cardActions;
        this.isImmortal = isImmortal;
        this.isMagicProof = isMagicProof;
        this.canMartyr = canMartyr;
        this.weight = weight;
    }
}