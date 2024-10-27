import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOddArray {

	public static void main(String[] args) {
		Integer x[]= {2,56,37,89,90,54,35};
		List<Integer> asList = Arrays.asList(x);
		
		Map<Boolean, List<Integer>> collect = asList.stream().collect(Collectors.partitioningBy(e->e%2==0));
		List<Integer> list = collect.get(true);
		List<Integer> list2 = collect.get(false);
		System.out.println(list);
		
//		List<Integer> collect = asList.stream().filter(e->e%2==0).collect(Collectors.toList());
//		System.out.println(collect);
//		
//		List<Integer> collect2 = asList.stream().filter(e->e%2!= 0).collect(Collectors.toList());
//		System.out.println(collect2);
//		
		for (int i = 0; i < x.length; i++) {
			if (x[i]%2==0) {
				System.out.println(x[i]);
			}
		}
		for (Integer integer : x) {
			if(integer%2!=0) {
				System.out.println(integer);
			}
		}
	}

}
