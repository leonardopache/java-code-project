package pache.all.sort.algorithms;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

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
		mergeSort.stream().forEach(e -> System.out.println(e));
	}

	@Test
	public void testMergeSort_String() {
		Collection<? extends Comparable<String>> mergeSort = RecursiveSortMethods.mergeSort(Arrays
				.asList(new String[] { "wel", "elc", "lco", "com", "ome", "met", "eto", "toj", "oja", "jav", "ava", }));
		mergeSort.stream().forEach(e -> System.out.println(e));
	}

	@Test
	public void testQuickSort_Integer() {
		List<Comparable<Integer>> quickSort = Arrays.asList(new Integer[] { 9, 3, 1, 5, 6, 8, 2 });
		RecursiveSortMethods.quickSort(quickSort, 0, quickSort.size());
		quickSort.stream().forEach(e -> System.out.println(e));
	}

	@Test
	public void testQuickSort_String() {
		List<Comparable<String>> quickSort = Arrays
				.asList(new String[] { "wel", "elc", "lco", "com", "ome", "met", "eto", "toj", "oja", "jav", "ava", });

		RecursiveSortMethods.quickSort(quickSort, 0, quickSort.size());
		quickSort.stream().forEach(e -> System.out.println(e));
	}
}
