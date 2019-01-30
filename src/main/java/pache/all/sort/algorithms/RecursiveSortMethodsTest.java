package pache.all.sort.algorithms;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

public class RecursiveSortMethodsTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testMergeSort_Integer() {
		Collection<? extends Comparable<Integer>> mergeSort = RecursiveSortMethods
				.mergeSort(Arrays.asList(new Integer[] { 9, 3, 1, 5, 6, 8, 2 }));
		for (Comparable<Integer> iten : mergeSort) {
			System.out.println(iten);
		}
	}

	@Test
	public void testMergeSort_String() {
		Collection<? extends Comparable<String>> mergeSort = RecursiveSortMethods.mergeSort(Arrays
				.asList(new String[] { "wel", "elc", "lco", "com", "ome", "met", "eto", "toj", "oja", "jav", "ava", }));
		for (Comparable<String> iten : mergeSort) {
			System.out.println(iten);
		}
	}

}
