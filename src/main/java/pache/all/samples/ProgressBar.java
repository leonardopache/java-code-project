package pache.all.samples;
/**
 * 
 */


import java.util.Random;

/**
 * This progress bar doesn't work with eclipse console only on command line terminal.
 * 
 * @author lpache
 */
public class ProgressBar {

	public static void main(String[] args) throws Exception {
		printProgressBar();
	}

	private static void printProgressBar() throws InterruptedException {
		int sizeOfBar = 100;

		String barSelected = typeOfCharBar();
		String processed = barSelected;
		int incrementalProgressBar = barSelected.length();
		String str = " [%-" + sizeOfBar + "s]";

		for (int i = incrementalProgressBar; i <= sizeOfBar; i += incrementalProgressBar) {
			System.out.print(String.format(str, processed) + i + "% \r");
			processed = processed.concat(barSelected);
			Thread.sleep(100);
		}
		System.out.print("\n");
	}

	private static String typeOfCharBar() {
		String[] barChar = { "#", "/\\", "†" };
		return barChar[new Random().nextInt(3)];
	}

}
