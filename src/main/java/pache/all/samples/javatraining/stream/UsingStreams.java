package pache.all.samples.javatraining.stream;

import java.util.List;

public class UsingStreams {

	public static void printElements(List<?> arr) {
		arr.stream().forEach(e -> System.out.println(e + " => " + e));
	}
}
