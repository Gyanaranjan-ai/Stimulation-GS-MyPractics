import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SecondLargestSmallest {
	public static void main(String[] args) {
		Integer x[]= {23,47,98,1,23,98,999};
//		List<Integer> asList = Arrays.asList(x);
//		List<Integer> collect = asList.stream().sorted((a,b)->b.compareTo(a)).collect(Collectors.toList());
//		System.out.println(collect.get(1));
//		
//		Integer integer2 = asList.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
//		System.out.println(integer2);
//		
//		
//		
//		Integer integer = asList.stream().sorted().skip(1).findFirst().get();
//		System.out.println(integer);
//		
//		
//		
//		List<Integer> collect2 = asList.stream().sorted((a,b)->a.compareTo(b)).collect(Collectors.toList());
//		System.out.println(collect2.get(1));
		
		int temp;
		for (int i = 0; i < x.length; i++) {
			for (int j = i+1; j < x.length; j++) {
				if(x[i]<x[j]) {
					temp=x[i];
					x[i]=x[j];
					x[j]=temp;
				}
			}
		}
		System.out.println(x[1]);
	}

}
