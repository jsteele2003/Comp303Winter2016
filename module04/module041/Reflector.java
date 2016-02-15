package module041;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import module041.Card.Rank;
import module041.Card.Suit;

public class Reflector
{
	private static final String CARD_NAME = "module041.Card";
	
	public static void main(String[] args) throws Exception
	{
		Card card = Card.get(Rank.ACE, Suit.CLUBS);
		Class<?> cardClass1 = Class.forName(CARD_NAME);
		Class<?> cardClass2 = Card.class;
		Class<?> ssuper = cardClass1.getSuperclass();
		
		for( Method m : cardClass1.getDeclaredMethods())
		{
			System.out.println(m.getName());
		}
		
		List<Method> noArgs = new ArrayList<>();
		for( Method m : cardClass1.getDeclaredMethods() )
		{
			if( m.getParameterTypes().length == 0 )
			{
				noArgs.add(m);
			}
		}
		Collections.shuffle(noArgs);
		
		System.out.println(noArgs.get(0).getName() + ":" + noArgs.get(0).invoke(card).toString());
		
		
		
	}
}
