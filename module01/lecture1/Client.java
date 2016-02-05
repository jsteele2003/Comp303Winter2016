package lecture1;

/** This client class is a stand in for any client code. */
public final class Client
{ 
	
	private static final String[] RANKS = {"Ace", "Two", "Three", "Four", 
			"Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", 
			"King"};
	
	private static final String[] SUITS = {"Clubs", "Diamonds", 
			"Spades", "Hearts"};
	
	private Client()
	{}
	
	
	/**
	 * @param pArgs no used
	 */
	public static void main(String[] pArgs)
	{
		System.out.println("l23");
		Card[] deck = new Card[RANKS.length * SUITS.length];
		
		for( Card.Suit suit : Card.Suit.values())
		{
			for( Card.Rank rank : Card.Rank.values())
			{
				deck[suit.ordinal()*Card.Rank.values().length + rank.ordinal()] = new Card(rank, suit);
			}
		}
		
		for( Card card : deck )
		{
			System.out.println(card);
		}
	}
	
}
