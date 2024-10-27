package Interview;

public class ReverseStringWithSpecialCharacters {

	    public static void main(String[] args) {
	        String s = "gyanaranj*sah%oo&";
	        String result = reverseStringKeepingSpecialChars(s);
	        System.out.println(result);
	    }

	    public static String reverseStringKeepingSpecialChars(String s) {
	        char[] arr = s.toCharArray();
	        int left = 0;
	        int right = arr.length - 1;

	        while (left < right) {
	            // Skip special characters from the left
	            if (!Character.isLetterOrDigit(arr[left])) {
	                left++;
	            }
	            // Skip special characters from the right
	            else if (!Character.isLetterOrDigit(arr[right])) {
	                right--;
	            }
	            // Swap non-special characters
	            else {
	                char temp = arr[left];
	                arr[left] = arr[right];
	                arr[right] = temp;
	                left++;
	                right--;
	            }
	        }

	        return new String(arr);
	    }
	}

