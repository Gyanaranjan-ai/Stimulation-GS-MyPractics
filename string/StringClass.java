package string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StringClass {

	public static void main(String[] args) {
		String s1 = "milu";
		String s2 = "Milu";
		String s12 = new String("Milu");
		System.out.println(s1.equals(s2));//false
		
		System.out.println(s1.equalsIgnoreCase(s12));//true
		
		String s3="a";
		String s4="A";
		
		System.out.println(s3.compareTo(s4));//
		
		System.out.println(s3.concat(s4));//aA
		
		System.out.println(s3+10);	//a10
		System.out.println(10+s3+10);	//10a10
		System.out.println(10+20+s3);	//30a
		
		System.out.println(String.join(",", s3,s4)); //a,A
		
		String s ="this is demo";
		System.out.println(s.subSequence(3, 9)); //s is d
		System.out.println(s.substring(3, 9));//s is d
		System.out.println(s.substring(3));  //s is demo
		
		System.out.println(s.replaceAll("is", "was"));// thwas was demo
		
		System.out.println(s.replaceFirst("th", "im"));//imis is demo
		
		System.out.println(s.replace('s', 'a'));//thia ia demo
		
		System.out.println("_______________________");
		
		System.out.println(s.replaceAll("is(.)", "was")); //thwaswasdemo
		
		System.out.println(s.replaceAll("is(.*)", "was")); //thwas
		
		//String s ="this is demo";
		System.out.println(s.indexOf('e'));//9
		
		System.out.println(s.indexOf("is"));//2
		
		System.out.println(s.charAt(3));//s
		
		System.out.println(s.contains("de"));//true
		
		System.out.println(s.startsWith("t"));//true
		
		System.out.println(s.endsWith("t"));//false
		
		
		System.out.println(s.toUpperCase());//THIS IS DEMO
		
		System.out.println(s.toLowerCase());//this is demo
		
		int a=10;
		String valueOf = String.valueOf(a);
		
		char[] charArray = s.toCharArray();
		System.out.println(charArray);//this is demo
		
		
		StringBuffer sb = new StringBuffer();
		
		System.out.println(sb.capacity());//16
		sb.ensureCapacity(100);
		System.out.println(sb.capacity());//100
		
		System.out.println(sb.append("gyana ranjan"));//gyana ranjan
		
		System.out.println(sb.capacity());//100
		
		sb.trimToSize();//it will remove the extra space
		System.out.println(sb.capacity());//12
		StringBuffer sb1 = new StringBuffer("Gyana");
		
		sb1.setCharAt(4, 'd');
		System.out.println(sb1);//Gyand
		sb1.setLength(3);
		System.out.println(sb1);//Gya
		
		StringBuffer bs = sb1.append("milu");
		System.out.println(bs);//Gyamilu
		
		System.out.println(sb1.equals(bs));//true
		
		System.out.println(sb1.indexOf("a"));//2
		
		System.out.println(sb1.insert(3, "zzzz"));//Gyazzzzmilu
		System.out.println("____________________");
		//it will remove 2& 3
		System.out.println(sb1.replace(1,3 , "m"));//Gmzzzzmilu
		
		System.out.println(sb1.reverse());//ulimzzzzmG
		System.out.println(sb1.subSequence(2, 4));//im
		
		System.out.println(sb1.substring(2,4));//im
		System.out.println(sb1.substring(3)); //mzzzzmG
		
		
		System.out.println(sb1.delete(2, 4));//ulzzzzmG
		System.out.println("___________");
		System.out.println(sb1.deleteCharAt(1));//uzzzzmG
		
		StringBuffer sb2 = new StringBuffer("milu");
		StringBuffer sb3= new StringBuffer("milu");
		
		System.out.println(sb2.equals(sb3)+"--");//false
		
		
		String str=" suu^&&deu^%&*@%^@ dubdu  ";
		String replaceAll = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(replaceAll+"____________");
		//it will remove 1st & last space
		System.out.println(str.trim());
		//remove white Space
//		System.out.println(str.replaceAll(" ", ""));
		System.out.println(str.replaceAll("\\s", ""));
		
		//distict Charecter
		Set<Character> st = new HashSet<Character>();
		 for (char c : str.toCharArray()) {
	            if (c != ' ') { // Optional: skip spaces if you don't want them counted
	                st.add(c);
	            }
		 }
		 System.out.println(st+"    eih");
		 
		 List<Character> collect2 = str.chars().mapToObj(e->(char)e).distinct().collect(Collectors.toList());
		 System.out.println(collect2+"+++++++++");
				
		
		
		List<Integer> asList = Arrays.asList(9,5,3,6,8,0,1,1,6,3,5,7,6);
//		for (int i = 0; i < charArray.length; i++) {
//			if (x[i]%2==0) {
//				System.out.println(x[]);
//			}
//		}
		
		List<Integer> collect = asList.stream().filter(k->k%2==0).distinct().collect(Collectors.toList());
		
		System.out.println(collect);
		
		
		
		
		

	}
}
