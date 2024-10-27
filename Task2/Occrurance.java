import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Occrurance {
	public static void main(String[] args) {
		String s= "gyanaranjan Sahoo";
		
		//using java8
		
		Map<Character, Long> collect = s.chars().mapToObj(e->(char)e).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(collect);
		
		
		Map<Character, Integer> m= new HashMap<Character, Integer>();
//		char[] c=s.toCharArray();
//		for(char x:c) {
//			if(!m.containsKey(x))
//			m.put(x, 1);
//			else {
//				Integer integer = m.get(x);
//				m.put(x, integer+1);
//			}
//		}
//		System.out.println(m);
		for (int i = 0; i < s.length(); i++) {
			char c=s.charAt(i);
			if(!m.containsKey(c))
			m.put(c, 1);
			else {
				int n=m.get(c);
				n++;
				m.put(c, n);
			}
			
		}
		System.out.println(m);
		
		Map<Character, Long> sk=s.chars().mapToObj(e->(char)e).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		
		
		
		
		
		
		
		
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
//		char[] charArray = s.toCharArray();
//		for (char c : charArray) {
//			if(!map.containsKey(c))
//			map.put(c, 1);
//			else {
//				Integer integer = map.get(c);
//				map.put(c, integer+1);
//			}
//		}
		System.out.println(map);
		
		//f
		for (int i = 0; i < s.length(); i++) {
			char charAt = s.charAt(i);
			if(!(map.containsKey(charAt))) {
				map.put(charAt,1);
			}else {
				Integer integer = map.get(charAt);
				integer++;
				map.put(charAt, integer);
			}
				
			
		}
		System.out.println(map);
	}

}
