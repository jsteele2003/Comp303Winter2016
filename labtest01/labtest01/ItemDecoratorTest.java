package labtest01;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ItemDecoratorTest {

	private ItemDecorator aDecorated;
	private Item aItem;
	private final String prefix = "ITEM-";
	
	
	
	@Test
	public void testGetName() {
		aItem = new Item("Bread", 34, 001);
		aDecorated = new ItemDecorator(aItem);
		assertNotEquals(aDecorated.getName(), aItem.getName());
	}

}
