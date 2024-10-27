import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseString {
	public static void main(String[] args) {
		String st = "Gyana ranjan Sahoo";
		String s="";
		
		StringBuffer str = new StringBuffer(st);
		System.out.println(str.reverse());
		
		StringBuilder sb = new StringBuilder(st);
		System.out.println(sb.reverse());
		
		for (int i = st.length()-1; i >=0; i--) {
			s+= st.charAt(i);
		}
		System.out.println(s);
		for (int i = st.length()-1; i >=0; i--) {
			System.out.print(st.charAt(i));
		}
		//using java 8
		System.out.println();
		String collect = IntStream.range(0, s.length()).mapToObj(e->st.charAt(st.length()-1-e)).map(e->String.valueOf(e)).collect(Collectors.joining());
	System.out.println(collect);
	}
}
