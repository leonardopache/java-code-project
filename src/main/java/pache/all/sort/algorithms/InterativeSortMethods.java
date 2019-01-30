/**
 * 
 */
package pache.all.sort.algorithms;

import java.util.List;

/**
 * Class with implementation of some sort algorithms like
 * {@link #bubbleSort(List)}
 * 
 * @author lmarquespache
 */
public class InterativeSortMethods {

	private InterativeSortMethods() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Implementation of bubble sort that means compare if the actual position is
	 * bigger than the next to swap the pair. Repeat this step N times until the
	 * list is sorted.
	 * 
	 * @return sorted list
	 */
	public static <T> List<? extends Comparable<T>> bubbleSort(List<? extends Comparable<T>> collection) {

		for (int endOfUnsorted = collection.size() - 1; endOfUnsorted > 0; endOfUnsorted--) {
			for (int i = 0; i < endOfUnsorted; i++) {
				if (collection.get(i).compareTo((T) collection.get(i + 1)) > 0) {
					swapBubbleSort(collection, i, i + 1);
				}
			}
		}

		return collection;
	}

	private static <T> void swapBubbleSort(List<T> collection, int i, int j) {
		T temp = collection.get(i);
		collection.set(i, collection.get(j));
		collection.set(j, temp);
	}
}
