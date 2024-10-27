package list;

import java.util.HashMap;
import java.util.Map;

public class HashMapppp {
	public static void main(String[] args) {
		Map<String, Integer> map= new HashMap<>();
		map.put("A", 1);
		map.put("B", 3);
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}
}