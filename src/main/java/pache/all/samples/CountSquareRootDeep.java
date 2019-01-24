package pache.all.samples;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * 
 * @author lpache
 */
public class CountSquareRootDeep {

	public static int solution(int A, int B) {

		List<Integer> sqrtValues = new ArrayList<>();
		findForSquareRootValues(A, B, sqrtValues);
		
		// remove
		for (Integer integer : sqrtValues) {
			System.out.println(integer);
		}

		int countSqrt = 0;
		for (Integer value : sqrtValues) {

			int timesCalculated = calculateUntilZero(value, 0);
			if(countSqrt < timesCalculated) {
				countSqrt = timesCalculated;
			}
		}

		return countSqrt;
	}

	private static int calculateUntilZero(Integer value, Integer countDeep) {
		double sqrt = Math.sqrt(value);
		if(sqrt >= 2 && (sqrt - Math.floor(sqrt) == 0)) {
			countDeep = calculateUntilZero((int) sqrt, countDeep+1);
		}
		return countDeep;
	}

	private static void findForSquareRootValues(int A, int B, List<Integer> sqrtValues) {
		for (int index = A; index <= B; index++) {
			double sqrt = Math.sqrt(index);
			System.out.println(sqrt);
			if ((sqrt - Math.floor(sqrt)) == 0) {
				sqrtValues.add(index);
			}
		}
	}

	public static void main(String[] args) {
		System.out.println(solution(10, 20));
		System.out.println(solution(6000, 7000));
	}

}
