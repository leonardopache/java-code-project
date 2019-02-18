/**
 * 
 */
package pache.all.samples.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lpache
 *
 */
public class RemoveDuplicatedValues {

	/**
	 * remove duplicated values [1, 3, 6, 7, 3, 9, 10, 7]
	 *
	 * Complexity O(n2)
	 * 
	 * @param array
	 * @return
	 */
	public static int[] removeDuplicatesI(int[] array) {

		int[] indexToRemove = new int[array.length];
		for (int i = 0; i < indexToRemove.length; i++) {
			indexToRemove[i] = -1;
		}
		int index = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					indexToRemove[index] = i;
					index++;
				}
			}
		}
		return array;
	}

	/**
	 * remove duplicated values [1, 3, 6, 7, 3, 9, 10, 7]
	 * 
	 * Complexity O(n)
	 * 
	 * @param array
	 * @return
	 */
	public static int[] removeDuplicatesII(int[] array) {

		Map<Integer, Integer> mapWithoutDuplicated = new HashMap<>();
		for (int i = 0; i < array.length; i++) {
			mapWithoutDuplicated.put(array[i], array[i]);
		}
		int[] newArray = new int[mapWithoutDuplicated.values().size()];
		int i=0;
		for (int values : mapWithoutDuplicated.values()) {
			newArray[i] = values;
			i++;
		} 
		return newArray;
	}
}
