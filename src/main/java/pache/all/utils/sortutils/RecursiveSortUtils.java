/**
 * 
 */
package pache.all.utils.sortutils;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author lpache
 *
 */
public class RecursiveSortUtils {

	private RecursiveSortUtils() {
	}

	public static <T> Collection<? extends Comparable<T>> mergeSort(Collection<? extends Comparable<T>> list) {
		if (list == null)
			return null;

		if (list.size() <= 1)
			return list;

		Collection<? extends Comparable<T>> left = subList(list, 0, (list.size() / 2));
		Collection<? extends Comparable<T>> right = subList(list, Math.round(list.size() / 2), list.size());

		left = mergeSort(left);
		right = mergeSort(right);
		return (Collection<? extends Comparable<T>>) merge(new ArrayList<>(left), new ArrayList<>(right));
	}

	private static <T> Collection<T> subList(Collection<T> source, int start, int end) {
		Collection<T> subList = new ArrayList<>();
		for (int i = start; i < end; i++) {
			subList.add(new ArrayList<>(source).get(i));
		}
		return subList;
	}

	private static <T> Collection<T> merge(ArrayList<? extends Comparable<T>> left,
			ArrayList<? extends Comparable<T>> right) {
		Collection<T> sorted = new ArrayList<>();

		while (!left.isEmpty() && !right.isEmpty()) {
			if (left.get(0).compareTo((T) right.get(0)) <= 0) {
				sorted.add((T) left.get(0));
				left.remove(0);
			} else {
				sorted.add((T) right.get(0));
				right.remove(0);
			}
		}

		while (!left.isEmpty()) {
			sorted.add((T) left.get(0));
			left.remove(0);
		}

		while (!right.isEmpty()) {
			sorted.add((T) right.get(0));
			right.remove(0);
		}
		return sorted;
	}

	public static <T> Collection<T> quickSort(T collection) {
		return null;
	}
	
	public static <T> Collection<T> heapSort(T collection) {
		return null;
	}

}
