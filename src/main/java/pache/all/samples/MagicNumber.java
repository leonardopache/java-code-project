package pache.all.samples;
import java.util.Scanner;

/**
 * A lucky ticket is a six-digit number on the ticket in which sum of the first three 
 * digits is equal to the sum of the last three digits.
 *
 * For example, number 165912 is lucky because sum of 1+6+5 and 9+1+2, == 12
 * 
 * @author lpache
 *
 */
public class MagicNumber {
	static String findNextMagicNumber(int number) {
		number ++;
		while(true) {
			char[] charArray = formatNumberToStringWithZeroComplemented(number).toCharArray();
	        if(calculate(charArray[0], charArray[1], charArray[2]) == calculate(charArray[3], charArray[4], charArray[5]))
	        	break;
	        else
	        	number ++;
		}
		return formatNumberToStringWithZeroComplemented(number);
    }

	private static String formatNumberToStringWithZeroComplemented(int number) {
		return String.format("%06d", number);
	}

    private static int calculate(char c, char d, char e) {
		return Character.getNumericValue(c)+Character.getNumericValue(d)+Character.getNumericValue(e);
	}

    @SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    int number = in.nextInt();
	    System.out.println(findNextMagicNumber(number));
	}

}