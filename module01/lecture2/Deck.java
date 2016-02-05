package lecture2;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Stack;

import lecture2.Card.Rank;
import lecture2.Card.Suit;

public class Deck
{
	private final Stack<Card> aCards = new Stack<>();
	
	public static void main(String[] args)
	{
		Deck deck1 = new Deck();
		deck1.shuffle();
		Deck deck2 = new Deck(deck1);
	}
	
	public Deck()
	{
	}
	
	// There are different ways of doing this (left as an exercise).
	public List<Card> getCards()
	{
		ArrayList<Card> lCards = new ArrayList<Card>();
		
		for( Card card: aCards){
			lCards.add(new Card(card));
		}
		
		return lCards;
		//return Collections.unmodifiableList(aCards);
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
	
}
