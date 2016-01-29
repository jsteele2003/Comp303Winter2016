package ca.mcgill.comp303.module02.lecture1;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

import ca.mcgill.comp303.module02.lecture1.Card.Rank;
import ca.mcgill.comp303.module02.lecture1.Card.Suit;

/**
 * An iterable implementation of cards.
 */
public class Deck implements Iterable<Card>
{
	private final Stack<Card> aCards = new Stack<>();
	
	public static void main(String[] args)
	{
		Deck deck = new Deck();
		deck.shuffle();
		for( Card card : deck )
		{
			System.out.println(card);
		}
	}
	
	public Deck()
	{
	}
	
	public List<Card> getCards()
	{
		return Collections.unmodifiableList(aCards);
	}
	
	public Deck( Deck pDeck )
	{
		for( Card card : pDeck.aCards )
		{
			aCards.add(new Card(card));
		}
	}
	
	public void shuffle()
	{
		aCards.clear();
		for( Suit suit : Suit.values() )
		{
			for( Rank rank : Rank.values())
			{
				aCards.push(new Card(rank, suit));
			}
		}
		Collections.shuffle(aCards);
	}
	
	public boolean isEmpty()
	{
		return aCards.isEmpty();
	}
	
	public Card draw()
	{
		return aCards.pop();
	}

	@Override
	public Iterator<Card> iterator()
	{
		return aCards.iterator();
	}
}
