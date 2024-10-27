import java.util.Arrays;

public class ABS {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,6};
		
		int sum2 = Arrays.stream(arr).sum();
		int n=arr.length+1;
		int total=(n*(n+1))/2;
		System.out.println(total-sum2);
		
		int sum =0;
		int sum1=0;
		for (int i = 1; i <=6; i++) {
			sum =sum+i;
		}
		
		for (int i = 0; i < arr.length; i++) {
			sum1= sum1+arr[i];
		}
		System.out.println(sum-sum1);
		
//		
//        System.out.println("The missing number is: " + missingNumber);
		
//		int n=arr.length+1;
//		int sum3=(n*(n+1))/2;
		
	}
}
