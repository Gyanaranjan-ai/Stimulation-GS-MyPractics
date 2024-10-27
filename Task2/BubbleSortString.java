import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class BubbleSortString {

	public static void main(String[] args) {
	    String x[]={"Milu","gyan","Sahoo","ranjan"};

		String temp;
		for (int i = 0; i < x.length; i++) {
			for (int j = i+1; j < x.length; j++) {
				if (x[i].compareToIgnoreCase(x[j])>1) {
					temp=x[i];
					x[i]=x[j];
					x[j]=temp;
				}
			}
		}
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
//		
//		List<String> asList = Arrays.asList(x);
//		System.out.println(asList.stream().sorted(String.CASE_INSENSITIVE_ORDER).collect(Collectors.toList()));
//		
//		Arrays.sort(x);
//		System.out.println(Arrays.toString(x));
		
		Arrays.parallelSort(x);
		System.out.println(Arrays.toString(x));
		
		
		Integer num =36672727;
		int count=0;
		while(num>0) {
			count++;
			num=num/10;
		}
		System.out.println(count);
		
	}
}
