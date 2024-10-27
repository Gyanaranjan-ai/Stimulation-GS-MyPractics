import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * 
 */

/**
 * @author GSahoo
 *
 */
public class UsingStreamString {
	
	public static void main(String[] args) {
	List<String> asList = 
	Arrays.asList("Milu","Gyana","Ranjan","Sahoo");
	//SORT ASC
	List<String> collect = asList.stream().distinct().sorted(String.CASE_INSENSITIVE_ORDER).collect(Collectors.toList());
	System.out.println(collect);
	
	//SECOND STRING
	String string = asList.stream().sorted(String.CASE_INSENSITIVE_ORDER).skip(1).findFirst().get();
	System.out.println(string);
	//MINIMUN STRING
	Optional<String> min = asList.stream().min((a,b)->a.compareTo(b));
	System.out.println(min.get());
	
	//SORT DESC
	List<String> collect2 = asList.stream().sorted(String.CASE_INSENSITIVE_ORDER.reversed()).collect(Collectors.toList());
	System.out.println(collect2);
	
	List<String> collect3 = asList.stream().sorted((a,b)->b.compareTo(a)).collect(Collectors.toList());
	System.out.println(collect3);
	
	//SORT SECOND DESC
	String string2 = asList.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
	System.out.println(string2);
	
	//MININUM STRING
	Optional<String> min2 = asList.stream().min(String::compareTo);
	System.out.println(min2.get());
	Optional<String> min3 = asList.stream().min((a,b)->a.compareTo(b));
	System.out.println(min3.get());
	//UPPERCASE
	List<String> collect4 = asList.stream().map(e->e.toUpperCase()).collect(Collectors.toList());
	System.out.println(collect4);
	//LOWERCASE
	System.out.println(asList.stream().map(e->e.toLowerCase()).collect(Collectors.toList()));
	//GIVE THE NAME WHICH START WITH M
	System.out.println(asList.stream().filter(e->e.startsWith("M")).collect(Collectors.toList()));
	//how many gyana is present
	List<String> collect5 = asList.stream().filter(e->e.contains("Gyana")).collect(Collectors.toList());
	System.out.println(collect5.size());
	
	}
}
