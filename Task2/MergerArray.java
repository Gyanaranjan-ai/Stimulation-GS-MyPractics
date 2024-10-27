import java.util.Arrays;
import java.util.stream.*;

public class MergerArray {
	
	
	public static void main(String[] args) {
		int[] arr1 = {1, 3, 5, 7};
		int[] arr2 = {2, 4, 6, 8};
		int[] arr3 = mergeArrays(arr1, arr2);

		System.out.println("Array after merging - " + Arrays.toString(arr3));
	}
		public static int[] mergeArrays(int[] arr1, int[] arr2) {
		return IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).distinct().sorted().toArray();
			}
	}
