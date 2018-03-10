package pache.all.samples;
/**
 * Divide dividend by divisor with repeatedly subtracting until the result
 * become less than divisor. The quotient is obtained by counting the number of
 * subtractions. Implemented Recursively and Interactively
 * 
 * @author lpache
 */
public class DivisionBySubtraction {

	private DivisionBySubtraction() {
	}

	public static int subtractionInteractively(final int dividend, final int divisor) {
		if (dividend == 0 || divisor == 0)
			return 0;
		if (dividend <= divisor)
			return 0;

		int interaction = 0;
		int remainder = dividend;
		while (remainder >= divisor) {
			remainder = remainder - divisor;
			interaction++;
		}
		return interaction;
	}

	public static int subtractionRecursively(final int dividend, final int divisor) {
		if (dividend == 0 || divisor == 0)
			return 0;

		if (dividend <= divisor)
			return 0;

		return (1 + subtractionRecursively(dividend - divisor, divisor));
	}
}