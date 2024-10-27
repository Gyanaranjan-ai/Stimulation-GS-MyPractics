
public class A1B2C3 {
	public static void main(String[] args) {
		String s="a1b2c3";
//		char[] c = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(Character.isAlphabetic(c)) {
				System.out.print(c);
			}else {
				int n = Character.getNumericValue(c);
				for (int j = 1; j < n; j++) {
					System.out.print(s.charAt(i-1));
				}
			}
				
		}
	}

}
