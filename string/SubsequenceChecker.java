package string;

public class SubsequenceChecker {
	public static boolean isSubsequence(String s1,String s2) {
		int j=0;
		for (int i = 0; i < s1.length()&& j< s2.length(); i++) {
			if(s1.charAt(i)==s2.charAt(j)) {
				j++;
			}
		}
		return j==s2.length();
		
	}
	public static void main(String[] args) {
		String s1="bdhiwhidhata";
		String s2="data";
		String s3="dugdwgat";
		String s4="data";
		String s5="abc";
		String t ="ahbgdc";
		System.out.println(isSubsequence(s1, s2));
		System.out.println(isSubsequence(s3, s4));
		System.out.println(isSubsequence(s5, t));

	}

}
