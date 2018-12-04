/**
 * 
 */
package pache.regexjava.samples;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author lmarquespache
 *
 */
public class SamplesWithRegex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		String ip = "193.165.144.255";
//		System.out.println(ip.matches(new MyRegex().ipPattern));
//		
//		String date = "20/12/2015";
//		System.out.println(date.matches(new MyRegex().datePattern));
//		
//		StringUtil.removeDuplicateWords();
		
		String mail = "lp.ache@gmail.com";
		System.out.println(mail.matches(new MyRegex().mailPattern));
		
//		StringUtil.extractLoginFromMail();
	}

}
class MyRegex {

	public final String datePattern;
	public final String ipPattern;
	public final String mailPattern;
	
	public MyRegex() {
		String zeroTo255 = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
		ipPattern = "(" + zeroTo255  + "\\.){3}" + zeroTo255;
		
		String dates = "";
		datePattern = dates;
		
		String mail = "^[a-z\\.]+@gmail\\.com$";
		mailPattern = mail;
	}
}

class StringUtil{
	private static final String regex = "\\b(\\w+)(\\W+\\1\\b)+";
	private static final Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
	
	public static void removeDuplicateWords() {
		Scanner in = new Scanner(System.in);
		int numSentences = Integer.parseInt(in.nextLine());
        
        while(numSentences-- > 0) {
        	String input = in.nextLine();
			Matcher matcher = pattern.matcher(input);
        	
        	while(matcher.find()) {
        		input = input.replaceAll(matcher.group(), matcher.group(1));
        	}
        	System.out.println(input);
        }
        in.close();
	}

	public static void extractLoginFromMail() {
		// TODO Auto-generated method stub
		
	}
}

