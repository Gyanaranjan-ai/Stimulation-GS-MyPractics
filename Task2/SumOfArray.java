import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class SumOfArray {
	public static void main(String[] args) {
		Integer x[]= {1,4,3,5,6,2,4,3};
		List<Integer> asList = Arrays.asList(x);
		Integer reduce = asList.stream().reduce(0, Integer::sum);
		System.out.println(reduce);
		
		int sum =0;
//		for (Integer integer : x) {
//			sum+=integer;
//		}
//		System.out.println(sum);
		
		for (int i = 0; i < x.length; i++) {
			sum +=x[i];
		}
		System.out.println(sum);
		
		asList.stream().reduce(0,Integer::sum);
		int y[]= {1,4,3,5,6,2,4,3};
		Arrays.stream(y).sum();

		
		
	}

}
