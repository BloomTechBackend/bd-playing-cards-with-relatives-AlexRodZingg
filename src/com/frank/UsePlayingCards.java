package com.frank;

public class UsePlayingCards {
// This is our application program which will instantiate object and use thier methods to manipulate them
// We know this is the application program because it has the main() method
	public static void main(String[] args) {

		AmericanPlayingCard aUSACard = new AmericanPlayingCard(AmericanPlayingCard.CardValue.ONE, AmericanPlayingCard.CardSuit.HEART);
		System.out.println("aUSACard is :");
		aUSACard.showCard();  // runs the AmericanPlayingCard showCard()

		AmericanPlayingCard aUSACard2 = new AmericanPlayingCard(AmericanPlayingCard.CardValue.KING, AmericanPlayingCard.CardSuit.SPADE);
		System.out.println("aUSACard2 is :");
		aUSACard2.showCard();  // runs the AmericanPlayingCard showCard()

		System.out.println("The value in aUsaCard is: " + aUSACard.getValue());
		// Normally Java will look for a method in the class of the object used to invoke the method.
		//
		// aUsaCard.getValue() - Look for a getValue() method in AmericanPlayingCardClass
		//							Since there is no getValue() method in AmericanPLayingCard
		//								Java looks to the superclass of AmericanPlayingCard
		//								to see if it has one - superclass is PlayingCard
		//								if superclass has the method Java uses it
		//								if superclass does not have the method, Java continues up the inheritance tree
		//								until it runs out of superclasses

		//ItalianPlayingCard italianPlayingCard = new ItalianPlayingCard(6, "Coins");
		System.out.println("anItalianCard is: ");
		// italianPlayingCard.showCard(); // since there is a showCard() in ItalianPlayingCard class
										// 		Java is running the showCard() in the PlayingCard class

	}  // End of main()

}  // End of class that holds main()
