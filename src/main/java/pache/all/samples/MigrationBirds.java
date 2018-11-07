package pache.all.samples;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MigrationBirds {

	    // Complete the migratoryBirds function below.
	    static int migratoryBirds(List<Integer> arr) {
	        int[] type = new int[]{0,0,0,0,0};
	        for(int i=0; i<arr.size(); i++){
	            type[arr.get(i)-1]++;
	        }
	        for (int i : type) {
				System.out.println(i);
			}
	        int bird = 0;
	        for(int i=1, j=0; i<type.length; i++, j++){
	            if(type[j] >= type[i] && type[j] > type[bird])
	                bird = j;
	        }
	        if(type[type.length-1] > type[bird])
	            bird = type.length-1;
	        
	        return bird+1;
	    }

	    public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

	        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
	            .map(Integer::parseInt)
	            .collect(toList());

	        int result = migratoryBirds(arr);

	        System.out.println(result);
//	        bufferedWriter.write(String.valueOf(result));
//	        bufferedWriter.newLine();

	        bufferedReader.close();
//	        bufferedWriter.close();
	    }
	}