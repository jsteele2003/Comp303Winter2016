package ca.mcgill.comp303.module02.lecture1;

/**
 * Represents the concept of an Iterator 
 * without the type genericity.
 */
public interface CardIterator
{
	boolean hasNext();
	
	Card next();
}
