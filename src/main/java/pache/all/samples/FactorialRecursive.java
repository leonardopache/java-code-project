/**
 * 
 */
package pache.all.samples;

/**
 * @author lmarquespache
 *
 */
public class FactorialRecursive {

	public static Integer calculateFactorial(int num) {
		return factorial(num);
	}

	private static Integer factorial(int num) {
		if(num > 1)
			num *= factorial(num-1);
			
		return num;
	}
}
