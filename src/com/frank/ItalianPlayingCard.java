package com.frank;

// This represents an Italian Playing Card which is-a Playing Card

public class ItalianPlayingCard extends PlayingCard {

    private static final CardValue DEFAULTCARDVALUE = CardValue.JOKER;
    private static final CardColor DEFAULTCOLOR     = CardColor.YELLOW;
    private static final CardSuit DEFAULTSUIT      = CardSuit.JOKER;

    public static enum CardColor {  // define words to represent allowable card colors (instead of String)
        YELLOW, BLUE, RED, BLACK                  // These are the only valid values Java will allow
    };
    public static enum CardSuit {          // public is OK since they are constants and cannot be changed
        COINS, CUPS, SWORDS, BATONS, JOKER // static so it can be referenced using the class name. ie. no object required
    };
    public static enum CardValue {  // Using the fact that enums are really integers inside value to name our values
        JOKER, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, UNUSED1, UNUSED2, TEN, FANTE, CAVALLO, RE
    };

    public ItalianPlayingCard() {
        super(DEFAULTCARDVALUE.ordinal(), DEFAULTSUIT.toString(), DEFAULTCOLOR.toString());
    }
    // 2-arg taking a value and a suit
    public ItalianPlayingCard(CardValue value, CardSuit suit) {
        // call the super class 3-arg ctor with
        //  the value and suit we passed
        //  a default color (we can change this later)
        super(value.ordinal(), suit.toString(), DEFAULTCOLOR.toString()); // Call superclass ctor to initialize it

        if (value == CardValue.UNUSED1 || value == CardValue.UNUSED2) {
            setValue(DEFAULTCARDVALUE.ordinal());
        }
    }

    @Override // - optional when override a method in a super class
                // it asks compiler to be sure this is a valid override of a superclass method
                // valid means: same name, parameters and compatible/same return-type
    public void showCard() {
        System.out.println(this.toString()); // Since there is a toString() in this class
                                            //          its toString() is used instead of
                                            //          the toString() in the superclass
    }

    @Override
    public String toString() {
        return "ItalianPlayingCard{} " + super.toString();
    }
}
