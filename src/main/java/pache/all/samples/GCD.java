package pache.all.samples;
import java.math.BigInteger;

/**
 * 
 */

/**
 * @author lpache
 *
 */
public class GCD {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		int n = in.nextInt();
//		int n = 5;
		
	    int[] A = new int[]{3, 1, 4, 2, 8, 42};
//	    for(int A_i = 0; A_i < n; A_i++){
//	        A[A_i] = in.nextInt();
//	    }
	    int[] B = new int[]{5, 2, 12, 8, 3, 56};
//	    for(int B_i = 0; B_i < n; B_i++){
//	        B[B_i] = in.nextInt();
//	    }
	    int res = maximumGcdAndSum(A, B);
	    System.out.println(res);
	}

	private static int maximumGcdAndSum(int[] a, int[] b) {
		Data data = new Data();
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<b.length; j++) {
				BigInteger gcd = BigInteger.valueOf(a[i]).gcd(BigInteger.valueOf(b[j]));
				if(data.maxGCD.compareTo(gcd) < 0) {
					data.maxGCD = gcd;
					data.sum = a[i] + b[j];
					//System.out.println(a[i] + "_" + b[j] +" = "+data.maxGCD);
				} else if(data.maxGCD.compareTo(gcd) == 0 && data.sum < (a[i]+b[j])) {
					data.maxGCD = gcd;
					data.sum = a[i] + b[j];
					//System.out.println(a[i] + "_" + b[j] +" = "+data.maxGCD);
				}
			}
		}
		//System.out.println(data.sum);
		return (int) data.sum;
	}

}
class Data{
	public BigInteger maxGCD;
	public long sum;
	
	Data(){
		this.maxGCD = BigInteger.ZERO;
		this.sum = 0l;
	}
	
}

