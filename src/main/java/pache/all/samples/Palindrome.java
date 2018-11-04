/**
 * 
 */
package pache.all.samples;

import java.util.Scanner;

/**
 * @author lpache
 *
 */
public class Palindrome {

	private Palindrome() {}
	
	public static boolean isPalindrome(String str) {
		char[] charArray = str.toCharArray();
		int j = charArray.length-1;
		for (int i = 0; i < charArray.length; i++, j--) {
			if(charArray[i] != charArray[j])
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(isPalindrome(scan.next()));
	}
}
