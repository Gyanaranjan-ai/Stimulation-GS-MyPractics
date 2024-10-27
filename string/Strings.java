package string;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class Strings {
	
	public static void main(String[] args) {
		String str = "gyana#ranjan#sahoo@24";
String collect2 = IntStream.range(0, str.length()).mapToObj(e->str.charAt(str.length()-1-e)).map(String::valueOf).collect(Collectors.joining());
Map<Character, Long> collect3 = str.chars().mapToObj(e->(char)e).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));		
// Print the number of "#" separators in the input stringm
		int numHash = str.length() - str.replace("#", "").length();
		System.out.println(numHash);
		String replaceAll = str.replaceAll("[a-zA-z0-9]", "");
		System.out.println(replaceAll);
		// Replace all "#" separators with "$" and print the modified string
		String modifiedStr = str.replace("#", "$");
		System.out.println(modifiedStr);
		// Print the value of FIRSTNAME in uppercase
		String firstName = str.split("#")[0];
		System.out.println(firstName.toUpperCase());
		// Print the value of LASTNAME in lower case
		String lastName = str.split("#")[1];
		System.out.println(lastName.toLowerCase());
		// Print the FIRSTNAME characters in reverse order
		StringBuilder reversedFirstName = new StringBuilder(firstName);
		reversedFirstName.reverse();
		System.out.println(reversedFirstName);
		// Replace all separators with spaces and print the entire string
		modifiedStr = str.replace("#", " ").replace("@", " ");
		System.out.println(modifiedStr);
		// Print the number of "@" separators in the input string
		int numAt = str.length() - str.replace("@", "").length();
		System.out.println(numAt);
		// How many occurrence in this all letter
		List<String> asList = Arrays.asList(str.split(""));
//		System.out.println(asList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));
		Map<Character, Long> characterOccurrences = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(characterOccurrences);
		Map<String, Long> collect = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		// first multiple occurrence
		Optional<String> firstMultipleOccurrence = collect.entrySet().stream().filter(e -> e.getValue() > 1)
				.map(e -> e.getKey()).findFirst();
		System.out.println(firstMultipleOccurrence.get());		//change upper to lower & lower to upper character
		String s="gYaNaRanJaN SahOo";
		StringBuffer sb= new StringBuffer(s);
		for (int i = 0; i < s.length(); i++) {
			if(Character.isLowerCase(s.charAt(i))) {
				sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
			}else if(Character.isUpperCase(s.charAt(i))){
			sb.setCharAt(i, Character.toLowerCase(sb.charAt(i)));	
			}
		}
			System.out.println(sb);
	//  \\s-find space       \\d-searchdigit    \\w=specialcharacter
	//   [0-9]{5}=groupnof 5
		Pattern p=Pattern.compile("[@]");
		Matcher m = p.matcher(str);
		while(m.find()) {
			System.out.println(m.start()+"....."+m.group());
		}
		
	}
//	public static void main(String[] args) {
//		String s= "deepak";
//		String sr= new String("deepak");
//		String sr1= new String("deepak");
//		System.out.println(sr.equals(sr1));
//		System.out.println(s.equals(sr));
//		
//		String st = new String("deepak");
//				System.out.println(sr.equals(st));
//				
//				StringBuffer sb = new StringBuffer(s);	
//	System.out.println(sb.reverse());	
//	System.out.println(s.concat(sr));
//	System.out.println(String.join(",", s,sr));
//	System.out.println(s.subSequence(2, 5));
//	
//	StringBuffer sbs = new StringBuffer("milu");
//	StringBuffer sbs1=new StringBuffer("milu");
//	System.out.println(sbs.equals(sbs1));
//	
//	}

}
