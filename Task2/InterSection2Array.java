import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class InterSection2Array {
	public static void main(String[] args) {
		Integer x[]= {1,2,2,3,4,5,7};
		Integer y[]= {2,3,3,9,0};
		List<Integer> collect = Arrays.stream(x).filter(e->Arrays.stream(y).anyMatch(k->k==e)).collect(Collectors.toList());
	System.out.println(collect);
	//Aother way
	Set<Integer> hs= new HashSet<>();
	Set<Integer> inters= new HashSet<>();
	
	for(int k :x) {
		hs.add(k);
	}
	for(int j:y) {
		if(hs.contains(j)) {
			inters.add(j);
		}
	}
	System.out.println(inters);
	
	}
	

}
