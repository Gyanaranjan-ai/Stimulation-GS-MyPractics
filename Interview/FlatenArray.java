package Interview;
import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.List;
public class FlatenArray {
	

	    public static void main(String[] args) throws Exception {
	        Object[] array = {1, 2, new Object[]{3, 4, new Object[]{5}, 6, 7}, 8, 9, 10};

	        // Flatten the array
	        Integer[] flattenedArray = flatten(array);

	        // Print the flattened array
	        System.out.println(Arrays.toString(flattenedArray));
	    }

	    public static Integer[] flatten(Object[] inputArray) throws Exception {
	        List<Integer> flatList = new ArrayList<>();
	        flattenHelper(inputArray, flatList);
	        return flatList.toArray(new Integer[0]);
	    }

	    private static void flattenHelper(Object[] inputArray, List<Integer> flatList) throws Exception {
	        for (Object element : inputArray) {
	            if (element instanceof Integer) {
	                flatList.add((Integer) element);
	            } else if (element instanceof Object[]) {
	                flattenHelper((Object[]) element, flatList);
	            } else {
	                throw new Exception("Unsupported data type: " + element.getClass().getName());
	            }
	        }
	    }
	}


