package lecture2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import lecture2.Card.Rank;

public class Hand implements Iterable<Card>
{
	private List<Card> aCards = new ArrayList<Card>();

	@Override
	public Iterator<Card> iterator()
	{
		return aCards.iterator();
	}
	
	public static Comparator<Hand> createComparator(Rank pRank)
	{
		return new HandComparator(pRank);
	}
}

class HandComparator implements Comparator<Hand>
{
	private final Rank aRank;
	
	public HandComparator(Rank pRank)
	{
		aRank = pRank;
	}
	
	@Override
	public int compare(Hand pHand1, Hand pHand2)
	{
		return numberOfCardsWithRank(pHand1) - numberOfCardsWithRank(pHand2);
	}
	
	private int numberOfCardsWithRank(Hand pHand)
	{
		int total = 0;
		for( Card card : pHand)
		{
			if( card.getRank() == aRank )
			{
				total++;
			}
		}
		return total;
	}
}
