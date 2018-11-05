package pache.all.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class StringCountTest {

	private static final String ABC = "abc";

	@Test(expected = InstantiationError.class)
	public void constructFailTest(){
		assertNotNull(new StringCounter());
	}
	
	@Test
	public void countTest(){
		assertEquals(3l, StringCounter.count(ABC));

	}
}
