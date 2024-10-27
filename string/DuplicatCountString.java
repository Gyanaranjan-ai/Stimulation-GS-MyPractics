package string;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicatCountString {
	public static void main(String[] args) {

		String s = "Gyana Ranjan Gyana";

		String[] split = s.split(" ");
		List<String> asList = Arrays.asList(split);
		System.out.println(
				Arrays.stream(split).filter(e -> Collections.frequency(asList, e) > 1).collect(Collectors.toList()));
		Map<String, Long> k = Arrays.stream(split).filter(e -> Collections.frequency(asList, e) > 1)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(k);
	}

}
