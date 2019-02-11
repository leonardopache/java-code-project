/**
 * 
 */
package pache.all.sort.algorithms;

/**
 * Algorithm non-comparative integer sorting that sorts data with integer keys.
 * 
 * 
 * @author lmarquespache
 *
 */
public class NonComparativeSortMethods {

	/**
	 * for sorting a collection of objects according to keys that are small
	 * integers. It operates by counting the number of objects that have each
	 * distinct key value, and using arithmetic on those counts to determine the
	 * positions of each key value in the output sequence.
	 * 
	 * @param array
	 * @param min
	 * @param max
	 */
	public static void countingSort(Integer[] array, int min, int max) {

		int[] countArray = new int[(max - min) + 1];

		// fill countArray with the number of occurrence
		for (int i = 0; i < array.length; i++) {
			countArray[array[i] - min]++;
		}

		int j = 0;
		for (int i = min; i <= max; i++) {
			while (countArray[i - min] > 0) {
				array[j++] = i;
				countArray[i - min]--;
			}
		}
	}

	public void radixSort(Object[] array) {

	}
}
