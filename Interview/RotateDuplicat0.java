package Interview;
import java.util.Arrays;

public class RotateDuplicat0 {

	    public static void main(String[] args) {
	        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
	        duplicateZeros(arr);
	        System.out.println(Arrays.toString(arr));
	    }

	    public static void duplicateZeros(int[] arr) {
	        int n = arr.length;
	        int possibleDups = 0;
	        int length = n - 1;

	        // Find the number of zeros to be duplicated
	        for (int left = 0; left <= length - possibleDups; left++) {

	            if (arr[left] == 0) {
	                // Edge case: When 0 is found at the end
	                if (left == length - possibleDups) {
	                    arr[length] = 0; // For this zero we just copy it without duplication.
	                    length -= 1;
	                    break;
	                }
	                possibleDups++;
	            }
	        }

	        // Start backwards from the last element which would be part of new array
	        int last = length - possibleDups;

	        // Copy zero twice, and non zero once.
	        for (int i = last; i >= 0; i--) {
	            if (arr[i] == 0) {
	                arr[i + possibleDups] = 0;
	                possibleDups--;
	                arr[i + possibleDups] = 0;
	            } else {
	                arr[i + possibleDups] = arr[i];
	            }
	        }
	    }
	}

