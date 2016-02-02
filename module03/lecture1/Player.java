package lecture1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import lecture1.Card.Rank;
import lecture1.Card.Suit;

public class Player implements Iterable<Card>
{
	private String aName;
	private List<Card> aCards = new ArrayList<Card>();
	
	public Player(String pName)
	{
		aName = pName;
	}
	
	public void add(Card pCard)
	{
		aCards.add(pCard);
	}
	
	public int size()
	{
		return aCards.size();
	}
	
	public void remove(Card pCard)
	{
		aCards.remove(pCard);
	}
	
	public String getName()
	{
		return aName;
	}

	@Override
	public Iterator<Card> iterator()
	{
		return aCards.iterator();
	}

	public static void main(String[] args)
	{
		Player player = new Player("Martin");
		player.add( new Card(Rank.ACE, Suit.CLUBS) );
		player.remove( new Card(Rank.ACE, Suit.CLUBS) );
		System.out.println(player.size());
		
		HashSet<Card> cards = new HashSet<>();
		Card card = new Card(Rank.ACE, Suit.CLUBS);
		cards.add(card);
		System.out.println(cards.contains(new Card(Rank.ACE, Suit.CLUBS)));
		System.out.println(cards.contains(card));
	}
}
