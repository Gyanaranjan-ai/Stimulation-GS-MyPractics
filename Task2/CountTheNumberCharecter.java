import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CountTheNumberCharecter {

	public static void main(String[] args) {
		String s="Gyana Ranjan Sahooo";
		System.out.println(s.length());
		String replace = s.replace("a", "");
		System.out.println(s.length()-replace.length());
		
		//find the characte
		Map<Character, Long> collect = s.chars().mapToObj(e->(char)e).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(collect);
		
		//reverse the string
		String collect2 = IntStream.range(0, s.length()).mapToObj(e->s.charAt(s.length()-1-e)).map(e->String.valueOf(e)).collect(Collectors.joining());
	
	System.out.println(collect2);
	}

}
