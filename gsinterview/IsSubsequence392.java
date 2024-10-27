package gsinterview;

public class IsSubsequence392 {
	public static void main(String[] args) {
		String s1="abc";
		String s2="adbcg";
		
		String s3="dhgahta";
		String s4="data";
		
		System.out.println(issubb(s1,s2));
		System.out.println(issub(s3,s4));

	}
	
	public static boolean issubb(String s1, String s2) {
		int j=0;
	for (int i = 0; i < s2.length()&&j< s1.length(); i++) {
		if(s1.charAt(j)==s2.charAt(i)) {
			j++;
		}
	}
		
		return j==s1.length();
	}
	public static boolean issub(String s3, String s4) {
		int j =0;
		for (int i = 0; i < s3.length() && j<s4.length(); i++) {
			if(s3.charAt(i)==s4.charAt(j)) {
				
				j++;
			}
		}
		
		return j==s3.length();
	}

}
