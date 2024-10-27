import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateArray {
	public static void main(String[] args) {
		Integer x[]= {2,2,4,5,6,6,7,2,3,4};
		HashSet<Integer> hs = new HashSet<Integer>();
		for (int i = 0; i < x.length; i++) {
			boolean add = hs.add(x[i]);
			if(add==true) {
				System.out.print(x[i]+" ");
			}
		}
		System.out.println();
		List<Integer> asList = Arrays.asList(x);
		List<Integer> collect = asList.stream().distinct().collect(Collectors.toList());
		System.out.println(collect);
		
		
		
	}

}
