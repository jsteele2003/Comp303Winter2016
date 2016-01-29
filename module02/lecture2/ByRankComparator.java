package lecture2;

import java.util.Comparator;

import ca.mcgill.comp303.module02.lecture1.Card;

public class ByRankComparator implements Comparator<Card>
{
	@Override
	public int compare(Card pCard1, Card pCard2)
	{
		if( pCard1.getRank() == pCard2.getRank() )
		{
			return new BySuitComparator().compare(pCard1, pCard2);
		}
		else
		{
			return pCard1.getRank().ordinal() - pCard2.getRank().ordinal();
		}
	}

}

class BySuitComparator implements Comparator<Card>
{
	@Override
	public int compare(Card pCard1, Card pCard2)
	{
		if( pCard1.getSuit() == pCard2.getSuit() )
		{
			return new ByRankComparator().compare(pCard1, pCard2);
		}
		else
		{
			return pCard1.getSuit().ordinal() - pCard2.getSuit().ordinal();
		}
	}
}