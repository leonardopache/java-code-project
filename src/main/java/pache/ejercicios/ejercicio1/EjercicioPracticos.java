/**
 * 
 */
package pache.ejercicios.ejercicio1;

/**
 * @author lpache
 *
 */
public class EjercicioPracticos {

	private static final String EMPTY = "";

	private EjercicioPracticos() {
		throw new IllegalStateException("Utility class");
	}

	public static String convertDecimalToBinary(final long decimal) {
		long mod;
		long result = decimal;
		String binary = EMPTY;
		do {
			mod = result%2;
			result = result/2;
			binary = String.valueOf(mod).concat(binary);
		}while(result > 0);
		return binary;
	}

	public static boolean isPalindromo(final String str) {
		char[] charArray = str.toCharArray();
		String strInverted = EMPTY;
		int i = (charArray.length-1);
		while (i >= 0) {
			strInverted = strInverted.concat(String.valueOf(charArray[i]));
			i--;
		}
		return str.equalsIgnoreCase(strInverted);
	}

	
}
