package pache.all.samples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SubstringComparisons {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int k = scan.nextInt();
		scan.close();

		System.out.println(getSmallestAndLargest(s, k));
	}

	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";

		// Complete the function
		// 'smallest' must be the lexicographically smallest substring of length 'k'
		// 'largest' must be the lexicographically largest substring of length 'k'
		String[] newArray = new String[s.length() - (k - 1)];

		for (int i = 0; i < s.length() - (k - 1); i++) {
			// divide the string in substrings
			newArray[i] = s.substring(i, i + k);
		}
		Object[] mergeSort = mergeSort(new ArrayList<>(Arrays.asList(newArray))).toArray();
		smallest = (String) mergeSort[0];
		largest = (String) mergeSort[mergeSort.length-1];

		return smallest + "\n" + largest;
	}
	
	public static List<String> mergeSort(ArrayList<String> list) {
        if (list == null)
            return null;

        if (list.size() <= 1)
            return list;

        List<String> left = subList(list, 0, (list.size() / 2));
        List<String> right = subList(list, Math.round(list.size() / 2), list.size());

        left = mergeSort((ArrayList<String>) left);
        right = mergeSort((ArrayList<String>) right);
        return merge(new ArrayList<>(left), new ArrayList<>(right));
    }

    private static List<String> subList(ArrayList<String> source, int start, int end) {
        List<String> subList = new ArrayList<>();
        for (int i = start; i < end; i++) {
            subList.add(new ArrayList<>(source).get(i));
        }
        return subList;
    }

    private static List<String> merge(ArrayList<String> left,
            ArrayList<String> right) {
        List<String> sorted = new ArrayList<>();

        while (!left.isEmpty() && !right.isEmpty()) {
            if (left.get(0).compareTo(right.get(0)) <= 0) {
                sorted.add(left.get(0));
                left.remove(0);
            } else {
                sorted.add(right.get(0));
                right.remove(0);
            }
        }

        while (!left.isEmpty()) {
            sorted.add(left.get(0));
            left.remove(0);
        }

        while (!right.isEmpty()) {
            sorted.add(right.get(0));
            right.remove(0);
        }
        return sorted;
    }
}
