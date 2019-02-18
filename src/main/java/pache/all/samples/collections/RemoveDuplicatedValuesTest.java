package pache.all.samples.collections;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

public class RemoveDuplicatedValuesTest {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testRemoveDuplicatesI() {
		int[] removeDuplicatesI = RemoveDuplicatedValues.removeDuplicatesI(new int[] { 1, 3, 6, 7, 3, 9, 10, 7 });
		for (int i : removeDuplicatesI) {
			System.out.println(i);
		}
	}

	@Test
	public void testRemoveDuplicatesII() {
		int[] removeDuplicatesII = RemoveDuplicatedValues.removeDuplicatesII(new int[] { 1, 3, 6, 7, 3, 9, 10, 7 });
		for (int i : removeDuplicatesII) {
			System.out.println(i);
		}
	}

}
