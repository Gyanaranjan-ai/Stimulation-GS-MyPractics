
public class SwapTheElemntWithOutUsingThirdVariable {
	public static void main(String[] args) {
		int a=2,b=3;
//		a=a+b;
//		b=a-b;
//		a=a-b;
		
		a=a^b;
		b=a^b;
		a=a^b;
		
//		a=a*b;
//		b=a/b;
//		a=a/b;
		
//		b=a+b-(a=b);
		System.out.println("a="+a+" "+"b="+b);
		
		
	}

}
