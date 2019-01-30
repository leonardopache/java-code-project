/**
 * 
 */
package pache.all.sort.algorithms;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

/**
 * @author lmarquespache
 *
 */
public class InterativeSortMethodsTest {
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testBubble_Integer() {
		Collection<? extends Comparable<Integer>> bubbleSort = InterativeSortMethods
				.bubbleSort(Arrays.asList(new Integer[] { 9, 3, 1, 5, 6, 8, 2 }));

		bubbleSort.stream().forEach(e -> System.out.println(e + " => " + e));
	}
	
	
	@Test
	public void testBubble_Char() {
		Collection<? extends Comparable<Character>> bubbleSort = InterativeSortMethods
				.bubbleSort(Arrays.asList(new Character[] { 'a','f','w','k','c','q','m','a','b' }));

		bubbleSort.stream().forEach(e -> System.out.println(e + " => " + e));
	}
}