package pache.all.samples.javatraining.stream;

import java.util.Arrays;

import org.junit.Test;

public class UsingStreamsTest {

	@Test
	public void testPrintElements() {
		int[] integers = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		UsingStreams.printElements(Arrays.asList(integers));
	}

}
