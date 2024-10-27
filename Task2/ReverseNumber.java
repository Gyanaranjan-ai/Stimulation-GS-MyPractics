
public class ReverseNumber {
	public static void main(String[] args) {
		int num =3478379;
//		int rev =0;
//		while(num>0) {
//			rev = rev*10+num%10;
//			num =num/10;
//		}
//		System.out.println(rev);
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		System.out.println(sb.reverse());
		
		StringBuilder sb1= new StringBuilder(String.valueOf(num));
		System.out.println(sb1.reverse());
		
		String s= null;
		System.out.println(String.valueOf(s));
				
	}

}
