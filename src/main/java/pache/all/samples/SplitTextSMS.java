package pache.all.samples;
/**
 * 
 * @author lpache
 */
public class SplitTextSMS {

	public static int solution(String S, int K) {
       
		String[] textArray = S.split(" ");
		int countSMS = 0;
		String sms = "";
		for (String letter : textArray) {
			if((sms.length() + letter.length()) <= K) {
				sms += letter+" ";
			}else {
//				System.out.println(sms.trim());
				countSMS++;
				sms = letter+" ";
			}
		}
		if(sms.length() > 0) {
//			System.out.println(sms.trim());
			countSMS++;
		}

		return (countSMS == 0)?-1:countSMS;
    }
	
	
	public static void main(String[] args) {
		System.out.println(solution("SMS messages are really short", 12));
		System.out.println(solution("In this test will prove border", 12));
		System.out.println(solution("In this test I validate border", 12));
	}
}
