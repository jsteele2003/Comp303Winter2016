package module041;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestAbs
{
	@Test
	public void testAbs()
	{
		assertEquals(0,Math.abs(0));
		assertEquals(1,Math.abs(91));
		assertEquals(1,Math.abs(1));
		assertEquals(Integer.MAX_VALUE,Math.abs(Integer.MAX_VALUE));
		assertEquals(-Integer.MIN_VALUE,Math.abs(Integer.MIN_VALUE));


	}
	
}
