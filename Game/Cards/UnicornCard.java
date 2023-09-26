package Game.Cards;

import java.security.InvalidParameterException;

public class UnicornCard extends Card {
    public enum UnicornType {
        Baby,
        Basic,
        Magic
    }

    public final UnicornType unicornType;

    public UnicornCard(String name, UnicornType unicornType) throws InvalidParameterException {
        super(name, CardArchetype.Unicorn);
        
        // Super constructor call has to be first in a constructor.
        if (unicornType == UnicornType.Magic)
            throw new InvalidParameterException("This constructor cannot be used with \"unicornType\" set to \"Magic\".");

        this.unicornType = unicornType;
    }
}
