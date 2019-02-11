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
	@Test
	public void radixSort_IntegerTest() {
		Integer[] radixSort = new Integer[] { 4725, 4586, 1330, 8792, 5729 };
		NonComparativeSortMethods.radixSort(radixSort, 10, 4);
		for (Comparable<Integer> iten : radixSort) {
			System.out.println(iten);
		}
	}

	@Test
	public void radixSort_StringTest() {
		String[] radixSort = new String[] { "bcdef", "dbaqc", "abcde", "omadd", "bbbbb" };
		NonComparativeSortMethods.radixSort(radixSort, 26, 5);
		for (Comparable<String> iten : radixSort) {
			System.out.println(iten);
		}
	}
}
