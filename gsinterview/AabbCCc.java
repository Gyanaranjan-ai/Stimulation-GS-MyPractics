package gsinterview;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AabbCCc {
	public static void main(String[] args) {
		String s="aabbcc";
		Map<Character, Integer> map= new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(!map.containsKey(c)) {
				map.put(c, 1);
			}else {
				Integer n = map.get(c);
				map.put(c, n+1);
			}
		}
//		System.out.println(map);
		map.forEach((key,value)->System.out.print(key+""+value));;
		
		Map<Character, Long> collect = s.chars().mapToObj(e->(char)e).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	collect.forEach((key,value)->System.out.print(key+""+value));
	}

}
