package string;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SplitString {
	public static void main(String[] args) {
List<String> asList2 = Arrays.asList("Core Java", "Advance Java","nit kit");
		
		List<String> result = asList2.stream()
	            .flatMap(str -> Arrays.stream(str.split(" ")))
	            .collect(Collectors.toList());
		
		for (String string : result) {
			System.out.println(string);
		}	
		String s="gyanaranjan sahoo gyana sahoo";
		String[] split = s.split(" ");
		List<String> asList = Arrays.asList(split);
		System.out.println(asList.stream().filter(e->Collections.frequency(asList, e)>1).collect(Collectors.toList()));
		
		Map<String, Long> collect = asList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	System.out.println(collect);
	}

}
