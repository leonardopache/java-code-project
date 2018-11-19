package pache.all.samples;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FactorialRecursiveTest {

	@Test
	public void testCalculateFactorial() {
		assertTrue(FactorialRecursive.calculateFactorial(3) == 6);
	}

}
