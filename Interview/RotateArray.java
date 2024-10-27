package Interview;

import java.util.Arrays;
import java.util.Iterator;

public class RotateArray {
	public static void main(String[] args) {
		Integer x[]= {1,2,3,4,5,6,7};
		int n =4;
		for (int i = 0; i < n; i++) {
			int lastelemt=x[x.length-1];
			for (int j = x.length-1; j >0; j--) {
				x[j]=x[j-1];
			}
			x[0]=lastelemt;
		}
//		for (int i = 0; i < x.length; i++) {
//			System.out.print(x[i]+" ");
//		}
		System.out.println(Arrays.toString(x));
		
	}

}
