package string;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringAnlysisJava8 {
	public static void main(String[] args) {
		String strings[]= {"gyana","ranjan","Sahoo"};
//		Arrays.stream(s).forEach(s->System.out.println(s);
//				System.out.println(s.length());
		
		 Arrays.stream(strings).forEach(s -> {
	            System.out.println("String: " + s);
	            System.out.println("Length: " + s.length());
	            System.out.println("Character Occurrences: " + getCharacterOccurrences(s));
	            System.out.println();
	        });
	    }

	    public static Map<Character, Long> getCharacterOccurrences(String s) {
	        return s.chars()
	                .mapToObj(c -> (char) c)
	                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	    }
	}

