import java.util.Arrays;

public class FibonicSeries {
	public static void main(String[] args) {
		int n1=0,n2=1,sum=0,num =10;
//		System.out.print(n1+" "+n2);
//		for (int i = 2; i < num; i++) {
//			sum=n1+n2;
//			System.out.print(" "+sum);
//
//			n1=n2;
//			n2=sum;
//			
//
//		}
		int n =20;
		int[] fb = new int[n];
		
		fb[0]=0;
		fb[1]=1;
		for (int i = 2; i < fb.length; i++) {
			fb[i]= fb[i-1]+ fb[i-2];
		}
//		for (int i = 0; i < fb.length; i++) {
//			System.out.print(fb[i]+" ");
//		}
		System.out.println(Arrays.toString(fb));
		
	}
}
