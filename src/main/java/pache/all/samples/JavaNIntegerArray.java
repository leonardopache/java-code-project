package pache.all.samples;
public class JavaNIntegerArray {

	public static void main(String[] args) {
		int n = 6;
		StringBuffer x = new StringBuffer("#");
		for(int i=0; i<n; i++){
			String str = "%"+n+"s";
	        System.out.println(String.format(str, x));
	        x.append("#");
	    }
	}

}
