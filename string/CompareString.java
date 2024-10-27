package string;

import java.util.Arrays;

public class CompareString {
	public static void main(String[] args) {
		String s1="silent";
		String s2="listen";
		
		if(s1.length()!=s2.length()) {
			System.out.println("not matching");
			return;
		}
		char[] charArray1 = s1.toCharArray();
		char[] charArray2 = s2.toCharArray();
		Arrays.sort(charArray1);;
		Arrays.sort(charArray2);
		boolean equals = Arrays.equals(charArray1, charArray2);
		if(equals) {
			System.out.println("same");
		}else
			System.out.println("diffrent");
	}

}
