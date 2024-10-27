import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class UsingStreamInteger {
	public static void main(String[] args) {
		
		
		
		Integer x[]= {9,5,3,6,8,0,1,1,6,3,5,7,6};
		
		List<Integer> asList = Arrays.asList(x);
		
		 Map<Boolean, List<Integer>> partitioned = asList.stream()
		            .collect(Collectors.partitioningBy(e -> e % 2 == 0));

		        List<Integer> even = partitioned.get(true);
		        List<Integer> odd = partitioned.get(false);

		        System.out.println("Even numbers: " + even);
		        System.out.println("Odd numbers: " + odd);
		//EVEN
		List<Integer> even1 = asList.stream().filter(e->e%2==0).collect(Collectors.toList());
		System.out.println("EVen "+even1);
		
		//ODD
		
		List<Integer> odd1 = asList.stream().filter(e->e%2!=0).collect(Collectors.toList());
		System.out.println("Odd"+ odd1);
		
		//FIND DUPLICATE
		
		List<Integer> collect = asList.stream().filter(e->Collections.frequency(asList, e)>1).collect(Collectors.toList());
		
		System.out.println("Duplicate Value"+collect);
		
		//FIND DUPLICATE single element
		Set<Integer> collect2 = asList.stream().filter(e->Collections.frequency(asList, e)>1).collect(Collectors.toSet());
		System.out.println("Duplicate VAlue"+collect2);
		
		
		// REMOVE dUPLICATE
		List<Integer> collect3 = asList.stream().distinct().collect(Collectors.toList());
		System.out.println("RemoveDuplicate="+collect3);
		asList.stream().distinct().forEach(e->System.out.print(e+" "));
		
		System.out.println();
		//SORT THE ARRRAY ASC
		List<Integer> collect4 = asList.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println("SortAsc"+collect4);
		
		// //SORT THE ARRAY DESC
		List<Integer> list = asList.stream().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("SOrt Desc"+list);
	//{9,5,3,6,8,0,1,1,6,3,5,7,6};
		
		// //MINIMUM
		Optional<Integer> min = asList.stream().min((a,b)->a.compareTo(b));
		System.out.println(min.get());
		
		List<Integer> collect5 = asList.stream().sorted().collect(Collectors.toList());
		System.out.println(collect5.get(0));
		
		Optional<Integer> min2 = asList.stream().min(Integer::compareTo);
		System.out.println(min2.get());
		
		// //SECOND MIN
		List<Integer> collect6 = asList.stream().sorted().collect(Collectors.toList());
		System.out.println(collect6.get(1));
		
		System.out.println(asList.stream().sorted().skip(1).findFirst().get());
		
		//SECOND MAX
		System.out.println("SecondMax="+asList.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get());
		System.out.println("SecondMax="+asList.stream().sorted((a,b)->b.compareTo(a)).skip(1).findFirst().get());
		
		//
		//MAX ELEMENT
		
		Optional<Integer> max = asList.stream().max(Integer::compareTo);
		System.out.println(max.get());

		Integer integer = asList.stream().sorted(Comparator.reverseOrder()).findFirst().get();
		System.out.println(integer);
		//
		//SUM OF THE ARRAY
		Integer reduce = asList.stream().reduce(0, Integer::sum);
		System.out.println("Sum "+reduce);
		//
		//
		// //print the num greaterthan 5
		List<Integer> collect7 = asList.stream().filter(e->e>=5).collect(Collectors.toList());
		System.out.println("Greater tha 5="+collect7);
		// Reverse the element
		Collections.reverse(asList);
		System.out.println(asList);
		//Suffle the arra
		Collections.shuffle(asList);
		System.out.println(asList);

		
}
}
