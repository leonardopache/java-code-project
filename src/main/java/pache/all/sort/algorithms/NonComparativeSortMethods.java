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
	
	private NonComparativeSortMethods() {
	}

	/**
	 * for sorting a collection of objects according to keys that are small
	 * integers. It operates by counting the number of objects that have each
	 * distinct key value, and using arithmetic on those counts to determine the
	 * positions of each key value in the output sequence.
	 * Complexity O(n)
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

	/**
	 * 
	 * Complexity O(n)
	 * @param array
	 * @param radix
	 * @param width
	 */
	public static void radixSort(Object[] array, int radix, int width) {
		// sort elements by the width
		for (int i = 0; i < width; i++) {
			radixSingleSort(array, i, radix);
		}
	}

	private static void radixSingleSort(Object[] array, int position, int radix) {
		int numElement = array.length;
		int[] countArray = new int[radix];

		// sort using count sorting for every position
		for (Object value : array) {
			countArray[getDigit(position, value, radix)]++;
		}
		// Adjust the count array.
		for (int j = 1; j < radix; j++) {
			countArray[j] += countArray[j - 1];
		}

		// to keep the implementation of count sort stable and do not override the previous digit sort.
		Object[] tmp = new Object[numElement];
		for (int tempIndex = numElement - 1; tempIndex >= 0; tempIndex--) {
			tmp[--countArray[getDigit(position, array[tempIndex], radix)]] = array[tempIndex];
		}

		for (int tempIndex = 0; tempIndex < numElement; tempIndex++) {
			array[tempIndex] = tmp[tempIndex];
		}
	}

	private static int getDigit(int position, Object value, int radix) {
		if (value instanceof String) {
			return ((String)value).charAt(position) - 'a';
		} else
			return (int)value / (int) Math.pow(radix, position) % radix;
	}

}
