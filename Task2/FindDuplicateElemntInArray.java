import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.swing.text.StyledEditorKit.BoldAction;

public class FindDuplicateElemntInArray {

	public static void main(String[] args) {
		Integer x[]= {23,43,56,78,78,12,36,23};
		boolean s= false;
		for (int i = 0; i < x.length; i++) {
			for (int j = i+1; j < x.length; j++) {
				if(x[i]==x[j]) {
					System.out.println(x[i]);
				 s=true;
				}
			}
		}
		if (s==false) {
			System.out.println("No Duplicate");
		}
		
		HashSet<Integer> hs = new HashSet<Integer>();
		for (int i = 0; i < x.length; i++) {
			boolean add = hs.add(x[i]);
			if (add==false) {
				System.out.println(x[i]);
			}
		}
		List<Integer> asList = Arrays.asList(x);

		
		List<Integer> duplcsate = asList.stream().sorted(Comparator.reverseOrder()).distinct().collect(Collectors.toList());
		System.out.println(duplcsate);
		
		Set<Integer> collect = asList.stream().filter(e->Collections.frequency(asList, e)>1).collect(Collectors.toSet());
		System.out.println(collect);
		//finddirst
		Integer integer = asList.stream().filter(e->Collections.frequency(asList, e)>1).findFirst().get();
		System.out.println(integer);
		
		//find last
		System.out.println(asList.stream().sorted(Comparator.reverseOrder()).filter(e->Collections.frequency(asList,e)>1).findFirst().get());
	}
}
