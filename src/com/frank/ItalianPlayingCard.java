package com.frank;

// This represents an Italian Playing Card which is-a Playing Card

public class ItalianPlayingCard extends PlayingCard {

    // 2-arg taking a value and a suit
    public ItalianPlayingCard(int value, String suit) {
        // call the super class 3-arg ctor with
        //  the value and suit we passed
        //  a default color (we can change this later)
        super(value, suit, "Yellow"); // Call superclass ctor to initialize it
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
