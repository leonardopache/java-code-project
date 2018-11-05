package pache.algorithms.kadanes.complexity.on2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayBalance {
	public static Map<Integer, Integer> map = new HashMap<>();
	public static int[] betterDivision;

	public static void balance(int[] args) {
		betterDivision = new int[]{ 0, 0 };
		int maxA = args[0];
		
		for (int i = 0; i < args.length - 1; i++) {
			maxA = (args[i] > maxA) ? args[i] : maxA;
			splitArray(i, Arrays.copyOfRange(args, i + 1, args.length), maxA);
		}
		printBetterDivision();
	}

	private static void splitArray(int i, int[] subA, int maxA) {
		int maxB = subA[0];
		 for (int j = 0; j < subA.length; j++) {
		 maxB = (subA[j] > maxB) ? subA[j] : maxB;
		 }

		map.put(i, maxA - maxB);
		if ((maxA - maxB) > betterDivision[1]) {
			betterDivision[0] = i;
			betterDivision[1] = maxA - maxB;
		}
	}

	private static void printBetterDivision() {
		map.keySet().stream().forEach(e -> System.out.println(e + " => " + map.get(e)));
		System.out.println(betterDivision[0]);
	}
}
