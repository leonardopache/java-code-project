package pache.algorithms.kadanes.complexity.on;

import java.util.HashMap;
import java.util.Map;

public class ArrayBalance {

	public static void balance(int[] args) {
		if (args != null && args.length > 0) {
			int[] calculateBalance = calculateBalance(args);
			System.out.println(calculateBalance[0]);
		}
	}

	private static int[] calculateBalance(int[] args) {
		
		if(args.length == 1)
			return new int[] {0,0};

		int maxA = args[0];
		int maxB = args[1];
		int j = 1;
		int diff = maxA - maxB;
		int[] result = new int[] {0, diff};
		
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < args.length - 1; i++) {
			maxB = (args[j] > maxB) ? args[j] : maxB;
			if (args[i] > maxA) {
				maxA = args[i];
				maxB = args[i + 1];
				j = i + 1;
			}

			if ((maxA - maxB) > diff) {
				diff = (maxA - maxB);
				result = new int[] { i, diff };
			}

			map.put(i, diff);
			maxB = (args[i] > maxB) ? args[i] : maxB;
			j++;
		}
		map.keySet().stream().forEach(e -> System.out.println(e + " => " + map.get(e)));
		return result;
	}

}
