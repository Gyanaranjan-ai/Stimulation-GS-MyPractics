package string;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CountTheNumberCharecter {

	public static void main(String[] args) {
		String s="Gyana Ranjan Sahooo";
		System.out.println(s.length());
		String replace = s.replace("a", "");
		System.out.println(s.length()-replace.length());
		
		String reversed = IntStream.range(0, s.length())
                .mapToObj(i -> s.charAt(s.length() - 1 - i))
//                .map(String::valueOf)
                .map(e->String.valueOf(e))
                .collect(Collectors.joining());
		System.out.println(reversed);
	}

}
