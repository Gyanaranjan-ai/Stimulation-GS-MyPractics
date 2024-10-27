package string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringOccurance {
	public static void main(String[] args) {
		String st = "Schedule interview";
		String s = st.replaceAll(" ", "");
		Map<Character, Integer> map = new LinkedHashMap<>();
//        char[] charArray = s.toCharArray();
//        for (char c : charArray) {
//        	if(!map.containsKey(c))
//			map.put(c, 1);
//        	else {
//        		Integer integer = map.get(c);
//        		map.put(c, integer+1);
//        	}
//        	
//		}
//        System.out.println(map);

		// Approch -2

		for (int i = 0; i < s.length(); i++) {
			char charAt = s.charAt(i);
			if (!map.containsKey(charAt))
				map.put(charAt, 1);
			else {
				Integer integer = map.get(charAt);
				integer++;
				map.put(charAt, integer);
			}
		}
		System.out.println(map);
		
//		for(Map.Entry<Character, Integer> c:map.entrySet()){
//			//FInd the fistNon RepethingCharcter add the condition
//			if(c.getValue()==1) {
//			//FInd the fistRepethingCharcter
////				if(c.getValue()>1) {
//				System.out.println(c.getKey());
//				break;
//			}
//		}
		//max occurance;
		
		int maxccount=0;
		char maxKey='0';
		for (Map.Entry<Character, Integer> k:map.entrySet()){
			
			if(k.getValue()>maxccount) {
				maxccount=k.getValue();
				maxKey=k.getKey();
			}
			
		}
        System.out.println("Character with max occurrence: " + maxKey + " with count: " + maxccount);

		//Last NonOChruance
        char lastnon ='0';
        for (int i = s.length()-1;i>=0; i--) {
			char c = s.charAt(i);
			if(map.get(c)==1) {
				lastnon=c;
				break;
			}
		}
        System.out.println(lastnon);
		
		Integer x[]= {1,1,2,3,4,5,5,5,6};
		List<Integer> asList = Arrays.asList(x);
//		Map<Integer, Long> collect = asList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//		System.out.println(collect);
	}
}
