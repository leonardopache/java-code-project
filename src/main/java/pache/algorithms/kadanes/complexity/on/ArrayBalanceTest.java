package pache.algorithms.kadanes.complexity.on;

import org.junit.Test;

public class ArrayBalanceTest {

	@Test
	public void testArrayBalance_1() {
		ArrayBalance.balance(null);
	}

	@Test
	public void testArrayBalance_2() {
		ArrayBalance.balance(new int[] { 1 });
	}

	@Test
	public void testArrayBalance_3() {
		ArrayBalance.balance(new int[] { 1, 3 });
	}

	@Test
	public void testArrayBalance_4() {
		ArrayBalance.balance(new int[] { 4, 3, 2, 5, 1, -1 });
	}

	@Test
	public void testArrayBalance_5() {
		ArrayBalance.balance(new int[] { 1, 3, -3 });
	}
}
