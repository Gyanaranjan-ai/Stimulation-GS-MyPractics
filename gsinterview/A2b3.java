package gsinterview;

import java.util.HashMap;
import java.util.Map;

public class A2b3 {
	public static void main(String[] args) {
        // Example test cases
        System.out.println(compressString("aabbb"));  // Output: a2b3
        System.out.println(compressString("aaaa"));   // Output: a4
        System.out.println(compressString("a"));      // Output: a1
    }

	private static String compressString(String string) {
		Map<Character, Integer> map= new HashMap<Character, Integer>();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < string.length(); i++) {
			char c = string.charAt(i);
			if(!map.containsKey(c)) {
				map.put(c, 1);
			}else {
				Integer n = map.get(c);
				map.put(c, n+1);
			}
		}
		
		for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (map.containsKey(c)) {
                // Append the character and its count
                sb.append(c).append(map.get(c));
                // Remove the character from the map so it's only processed once
                map.remove(c);
            }
		
		}
		return sb.toString();
	}
}
