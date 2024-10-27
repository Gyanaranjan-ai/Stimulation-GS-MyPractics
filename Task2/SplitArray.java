import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitArray {
	public static void main(String[] args) {
        int[] original = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int splitSize = 2;

        List<int[]> list = splitArray(original, splitSize);
        list.forEach(e -> System.out.println(Arrays.toString(e)));
    }
    
    public static List<int[]> splitArray(int[] array, int splitSize) {
        List<int[]> result = new ArrayList<>();
        
        for (int i = 0; i < array.length; i += splitSize) {
            int end = Math.min(i + splitSize, array.length);
            int[] subArray = Arrays.copyOfRange(array, i, end);
            result.add(subArray);
        }
        
        return result;
    }
	}
/* expected Output 
[0, 1, 2]
[3, 4, 5]
[6, 7, 8]
[9]
*/



