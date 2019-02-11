package pache.all.sort.algorithms;

import org.junit.Test;

public class NonComparativeSortMethodsTest {

	@Test
	public void countSortTest() {
		Integer[] countingSort = new Integer[] { 2, 5, 9, 8, 2, 8, 7, 10, 4, 3 };
		NonComparativeSortMethods.countingSort(countingSort, 1, 10);
		for (Comparable<Integer> iten : countingSort) {
			System.out.println(iten);
		}
	}

}
