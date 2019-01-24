/**
 * 
 */
package pache.all.samples;

/**
 * @author lmarquespache
 *
 */
public class BinaryGap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(consecutiveOneInBinaryRepresentation(439));
		
		System.out.println(binaryGap(9));
		System.out.println(binaryGap(529));
		System.out.println(binaryGap(20));
		System.out.println(binaryGap(15));
		System.out.println(binaryGap(32));
	}

	private static int consecutiveOneInBinaryRepresentation(int n) {
		String binary = Integer.toBinaryString(n);
		int count = 0;
		int maxOnes = 0;
        for (char c :binary.toCharArray()) {
        	if(c == '1') {
        		count ++;
        	} else if(count > maxOnes) {
        		maxOnes = count;
        		count = 0;
        	} else {
        		count = 0;
        	}
		}
        if(count > maxOnes) {
    		maxOnes = count;
        }
        return maxOnes;
	}

	private static int binaryGap(int N) {
		String binary = Integer.toBinaryString(N);
		binary = binary.substring(binary.indexOf("1"), binary.lastIndexOf("1")+1);
		String[] gap = binary.split("1");

		if (gap.length == 0 || !binary.contains("0") 
				|| !binary.substring(1, binary.length()).contains("1")
				|| !binary.substring(0, binary.length() - 1).contains("1")) {
			return 0;
		}

		int maxGap = 0;
		for (String string : gap) {
			// System.out.println(string);
			if (string.length() > maxGap) {
				maxGap = string.length();
			}
		}

		return maxGap;
	}

	
	
}
