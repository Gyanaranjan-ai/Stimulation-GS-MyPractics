import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Merge2Array {
	public static void main(String[] args) {
//		List<Integer> asList = Arrays.asList(1,2,3,5,6,8,3,4,5);
//		List<Integer> asList2 = Arrays.asList(2,3,4,53,2,13,4,4);
//		List<Integer> collect = Stream.concat(asList.stream(), asList2.stream()).collect(Collectors.toList());
//		System.out.println(collect);
//		List<Integer> collect2 = collect.stream().distinct().collect(Collectors.toList());
//		System.out.println(collect2);
//		
//		
//		Set<Integer> collect3 = Stream.concat(asList.stream(), asList2.stream()).collect(Collectors.toSet());
//		System.out.println(collect3);
//		
//		List<Integer> collect4 = collect3.stream().sorted().collect(Collectors.toList());
//		System.out.println(collect4);
//		
//		Stream.concat(asList.stream(), asList2.stream()).collect(Collectors.toList());
		
		  int[] array1 = {1, 2, 3, 4};
	        int[] array2 = {3, 2, 5, 6};
	        
//	        List<Integer> l=new ArrayList<>();
//	        for(int k:array1) {
//	        	l.add(k);
//	        }
//	        for(int n:array2) {
//	        if(!l.contains(n))
//	        	l.add(n);
//	        }
//	        System.out.println(l+"____________");
	        // Merge two arrays into one using a method
	        int[] mergedArray = mergeArrays(array1, array2);

	        // Print the merged array
	        System.out.println(Arrays.toString(mergedArray));
	    }

	    // Method to merge two int arrays
	    public static int[] mergeArrays(int[] array1, int[] array2) {
	        return IntStream.concat(Arrays.stream(array1), Arrays.stream(array2))
	                        .distinct() // Optional: remove duplicates
	                        .toArray();
	    }
	}

