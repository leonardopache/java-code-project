package pache.algorithms.season.temperature;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AmplitudeTerm {

	public static String amplitude(int[] temperature) {
		Map<String, Integer> seasons = new HashMap();
		
		int chunk = temperature.length / 4; // chunk size to divide
		int i = 0;
		seasons.put("WINTER",  getAmplitude(Arrays.copyOfRange(temperature, i, i + chunk)));
		i+=chunk;
		seasons.put("SPRING",  getAmplitude(Arrays.copyOfRange(temperature, i, i + chunk)));
		i+=chunk;
		seasons.put("SUMMER",  getAmplitude(Arrays.copyOfRange(temperature, i, i + chunk)));
		i+=chunk;
		seasons.put("AUTUMN",  getAmplitude(Arrays.copyOfRange(temperature, i, i + chunk)));
		
		String season = "";
		int ampl = -1; 
		for (String item : seasons.keySet()) {
			if (seasons.get(item) > ampl) {
				season = item;
				ampl = seasons.get(item);
			}
		}
		
		return String.format("%s %d", season, ampl);
	}
	public static Integer getAmplitude(int[] temperatures) {
		int low = temperatures[0];
		int hi = temperatures[0]; 
		for (int j = 0; j < temperatures.length; j++) {
			if (low > temperatures[j]) {
				low = temperatures[j];
			}
			if (hi < temperatures[j]) {
				hi = temperatures[j];
			}
		}
		return Math.abs(low - hi);
	}

	public static void main(String[] args) {
		AmplitudeTerm a = new AmplitudeTerm();
		System.out.println(a.amplitude(new int[] { -3, -14, -5, 7, 8, 42, 8, 3 }));
	}

}
