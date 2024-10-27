import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortingIntegr {
	public static void main(String[] args) {
	Integer x[]= {32,43,3,89,76,55,56,55,4};
	int temp;
//	for (int i = 0; i < x.length; i++) {
//		for (int j = i+1; j < x.length; j++) {
//			if(x[i]>x[j]) {
//				temp=x[i];
//				x[i]=x[j];
//				x[j]=temp;
//			}
//		}
//		
//	}
//	for (Integer integer : x) {
//		System.out.println(integer);
//	}
	List<Integer> asList = Arrays.asList(x);
	System.out.println(asList.stream().sorted().collect(Collectors.toList()));
	
	Arrays.sort(x);
	System.out.println(Arrays.toString(x));
	
	Arrays.parallelSort(x);
	for (int i = 0; i < x.length; i++) {
		System.out.println(x[i]);
	}
	
	}
}
