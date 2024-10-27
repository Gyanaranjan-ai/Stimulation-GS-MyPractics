import java.util.Arrays;

public class MissingNumberArray {
	public static void main(String[] args) {
		int x[]= {1,2,3,4,5,7,8,9};
//		int sum3 = Arrays.stream(x).sum();
		
		int sum=0;
		int sum1=0;
		for (int i = 0; i <=9; i++) {
			sum+=i;
		}
		for (int i = 0; i < x.length; i++) {
			sum1 +=x[i];
		}
		
		System.out.println(sum-sum1);
		
		//Another method
		int sum2 = Arrays.stream(x).sum();
		int n =x.length+1;
		System.out.println(x.length+"__");
		
		int sumvalue= (n*(n+1))/2;
		
		System.out.println("missing array="+ (sumvalue-sum2));
		
		
		Integer y[]= {1,2,3,4,5,7,8,9};
		Integer reduce = Arrays.stream(y).reduce(5,Integer::sum);
		System.out.println(reduce);
		System.out.println(Arrays.stream(y).reduce(1,(a,b)->a*b));
	}

}
