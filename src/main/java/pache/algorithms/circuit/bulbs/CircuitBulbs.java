/**
 * 
 */
package pache.algorithms.circuit.bulbs;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lmarquespache
 *
 */
public class CircuitBulbs {

	private static int power = 1;
	private static List<Integer> listOrdered;

	public static int run(int[] array) {
		power = 1;
		int number = 0;
		listOrdered = new ArrayList<>();

		for (int kMoment : array) {
			if (shine(kMoment)) {
				number += 1;
				List<Integer> remove = new ArrayList<>();
				for (Integer item : listOrdered) {
					if (shine(item))
						remove.add(item);
					else
						break;
				}
				listOrdered.removeAll(remove);
			} else {
				insertOrdered(kMoment);
			}
		}
		return number;
	}

	public static void insertOrdered(int kMoment) {
		if (listOrdered.size() == 0) {
			listOrdered.add(kMoment);
			return;
		}
		int size = listOrdered.size();
		for (int i = 0; i < size; i++) {
			if (kMoment <= listOrdered.get(i))
				listOrdered.add(i, kMoment);
			else
				continue;
		}
		if (!listOrdered.contains(kMoment))
			listOrdered.add(kMoment);
	}

	public static boolean shine(int kValue) {
		if (kValue == (power)) {
			power += 1;
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		TestCircuitBulbs test = new TestCircuitBulbs();
		test.testCircuit();
	}
}

class TestCircuitBulbs {
	public static void testCircuit() {
		int[] a = { 2, 1, 3, 5, 4 };
		System.out.println(new CircuitBulbs().run(a));
		int[] b = { 2, 3, 4, 1, 5 };
		System.out.println(new CircuitBulbs().run(b));
		int[] c = { 1, 3, 4, 2, 5 };
		System.out.println( new CircuitBulbs().run(c));
		int[] d = { 3, 2, 1, 5, 4 };
		System.out.println(new CircuitBulbs().run(d));
	}

}