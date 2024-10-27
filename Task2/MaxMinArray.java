import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MaxMinArray {
	public static void main(String[] args) {
		Integer x[]= {26,372,37,37,29,773,98,2,98,92};
		List<Integer> asList = Arrays.asList(x);
		Optional<Integer> max = asList.stream().max((a,b)->a.compareTo(b));
		System.out.println(max.get());
		
		Optional<Integer> max2 = asList.stream().max(Integer::compareTo);
		System.out.println(max2.get());
		
		List<Integer> sorted = asList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(sorted.get(1));
		
		//Second Max
		List<Integer> collect = asList.stream().sorted((a,b)->b.compareTo(a) ).collect(Collectors.toList());
		System.out.println(collect.get(1));
		
		asList.stream().max((a,b)->a.compareTo(b)).get();
		asList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
		int max1=x[0];
		for (int i = 0; i < x.length; i++) {
			if (max1<x[i]) {
				max1=x[i];
			}
		}
		System.out.println(max1);
		
		
		Integer min = asList.stream().min((a,b)->a.compareTo(b)).get();
		System.out.println(min);
		
		Optional<Integer> min2 = asList.stream().min(Integer::compareTo);
		System.out.println(min2.get());
		
		
		List<Integer> collect2 = asList.stream().sorted((a,b)->a.compareTo(b)).collect(Collectors.toList());
		System.out.println(collect2.get(1));
		
		int min1=x[0];
		for (int i = 0; i < x.length; i++) {
			if(min1>x[i]) {
				min1=x[i];
			}
		}
		System.out.println(min1);
		
	}

}
