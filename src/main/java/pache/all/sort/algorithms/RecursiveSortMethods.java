/**
 * 
 */
package pache.all.sort.algorithms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Class with implementation of some sort algorithms like
 * {@link #mergeSort(Collection)}, {@link #heapSort(Object)},
 * {@link #quickSort(Object)}
 * 
 * @author lpache
 */
public class RecursiveSortMethods {

	private RecursiveSortMethods() {
	}

	/**
	 * This is a recursive implementation of merge sort that is a stable sort and
	 * use a divide an conquer algorithm. The algorithm is dived in two part: <br>
	 * 1 split the array until has many array of one value (Array with size one is
	 * sorted). <br>
	 * 2 Merge every left/right pair into a sorted array until has only one sorted
	 * array.
	 * 
	 * @param collection
	 * @return sorted collection
	 */
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

	/**
	 * This is a recursive implementation of quick sort that is a unstable sort and
	 * use a divide an conquer algorithm. 
	 * 
	 * @param list unsorted
	 * @param start position index
	 * @param end position index
	 * @return sorted collection
	 */
	public static <T> void quickSort(List<Comparable<T>> list, int start, int end) {
		// only one element, already ordered
		if (end - start < 2)
			return;

		int pivotIndex = partition(list, start, end);
		quickSort(list, start, pivotIndex);
		quickSort(list, pivotIndex + 1, end);
	}

	private static <T> int partition(List<Comparable<T>> list, int start, int end) {
		T pivot = (T) list.get(start);
		int i = start;
		int j = end;
		while (i < j) {
			while (i < j && list.get(--j).compareTo(pivot) >= 0)
				;
			if (i < j) {
				list.set(i, list.get(j));
			}
			while (i < j && list.get(++i).compareTo(pivot) <= 0)
				;
			if (i < j) {
				list.set(j, list.get(i));
			}
		}
		list.set(j, (Comparable<T>) pivot);
		return j;
	}

	public static <T> Collection<T> heapSort(T collection) {
		return null;
	}

}
