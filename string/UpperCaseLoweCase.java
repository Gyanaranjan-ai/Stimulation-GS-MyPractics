package string;

public class UpperCaseLoweCase {
	public static void main(String[] args) {
		String s ="GyanAranjan SahoO";
		int mid =s.length()/2;
		//fistHalf&second half
		String upperCase = s.substring(0, mid).toUpperCase();
		String lowerCase = s.substring(mid).toLowerCase();
		System.out.println(upperCase+lowerCase);
		//lower& upper
		StringBuffer sb = new StringBuffer(s.length());
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(Character.isLowerCase(c)) {
				sb.append(Character.toUpperCase(c));
				
			}else if (Character.isUpperCase(c)){
				sb.append(Character.toLowerCase(c));
			}else {
				sb.append((c));
			}
			
		}
		System.out.println(sb);
		
	}

}
