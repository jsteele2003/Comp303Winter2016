package lecture1;

import lecture1.Card.Suit;

public class Util
{
	/**
     * If Deck does not implement CardIterable, it could not be
     * passed as input to this general method.
	 */
	public static int countSuit(CardIterable pIterable, Suit pSuit)
	{
		int total = 0;
		CardIterator iterator = pIterable.iterator();
		while( iterator.hasNext() )
		{
			if( iterator.next().getSuit() == pSuit )
			{
				total++;
			}
		}
		return total;
	}
}
