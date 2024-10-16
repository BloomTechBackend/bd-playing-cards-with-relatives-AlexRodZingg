package com.frank;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class  AmericanPlayingCard extends PlayingCard{
	// static means there only shared by all
	// final means cannot be changed once it has been assigned a value
	// static final means only one occurrence, shared by all, that can't be changed
	private static final CardValue DEFAULTCARDVALUE = CardValue.JOKER;
	private static final CardColor DEFAULTCOLOR     = CardColor.BLACK;
	private static final CardSuit  DEFAULTSUIT      = CardSuit.JOKER;
	private static final CardValue MAXVALUE         = CardValue.KING;
	private static final CardValue MINVALUE         = CardValue.JOKER;

	// Making the enum public allows application programs to use the enum as constant too
	public static enum CardColor {  // define words to represent allowable card colors (instead of String)
		BLACK, RED                  // These are the only valid values Java will allow
	};
	public static enum CardSuit {          // public is OK since they are constants and cannot be changed
		SPADE, CLUB, HEART, DIAMOND, JOKER // static so it can be referenced using the class name. ie. no object required
	};
	public static enum CardValue {  // Using the fact that enums are really integers inside value to name our values
		JOKER, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
	};

	public AmericanPlayingCard() 
	{
	// super class ctor requires (int, String, String) parameters
	// so we need to convert enums when using them as arguments to the super class ctor
	// .ordinal() enum method provides the integer represented by the enum
	// .toString() enum method provides the enum as a String
		super(DEFAULTCARDVALUE.ordinal(), DEFAULTSUIT.toString(), DEFAULTCOLOR.toString());
	} 

	// 2-arg ctor (constructor) taking a CardValue and CardSuit as parameters
	public AmericanPlayingCard(CardValue value, CardSuit suit) {
        // super class ctor requires (int, String, String) parameters
		// so we need to convert enums when using them as arguments to the super class ctor
		// .ordinal() enum method provides the integer represented by the enum
		// .toString() enum method provides the enum as a String
		// Note: card color is determined by the CardSuit
		// Conditional operator provides the ability to use a value based on a condition
		// Conditional operator: 	condition ? value-if-true : value-if-false
		super(value.ordinal(),               // Call super ctor with value passed
			  suit.toString(),               // Call suoer ctor with suit passed
			 (suit == CardSuit.CLUB || suit == CardSuit.SPADE) ? CardColor.BLACK.toString() : CardColor.RED.toString());
	}

	// It is common for a subclass to call a super class method it overrides - in  this toString()
	// because the sub class doesn't know how to handle the super class data
	// the sub class is only responsible for any data it adds to the super class
	// so all the sub class has to do is decide how to handle it's new data
	// and use the super class method to handle super class data
	//
	@Override
	public String toString() {
		// the .values() method for any enum returns the enum values as an array
		// since PlayingCard stores the int value assigned to an enum value
		// we can use the value stored in the PlayingCard to convert the int value to its enum

		return "AmericanPlayingCard: "
	          +"Value: "    + super.getValue()     + " ("     // use the super class method to get the value
			  + CardValue.values()[super.getValue()] + ")"    //  and then use that value to determine enum it corressponds to
	          +" - Color: " + super.getColor()                // use the super class method to get the color
			  +" - Suit: "  + getSuit()                       // use the super class method to get the suit
				                                              //     super. optional because the sub class does not a have a method called getSuit()
			  +" - super.toString()=" + super.toString() + "\n";  // call the super class toString()
		                                                          // super. is required because we have a method with the same name
		                                                          // if omitted super. we would be calling ourselves recursively
	}

	public void showCard() {
		System.out.println(this.toString());
	}

}
