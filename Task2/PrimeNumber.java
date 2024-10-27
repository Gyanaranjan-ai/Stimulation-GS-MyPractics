
public class PrimeNumber {
	public static void main(String[] args) {
		int  num =20;
		int count=0;
		
		if(num>0) {
			for (int i = 1; i <=num; i++) {
				if(num%i==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println("it is a prime Number");
			}else {
				System.out.println("not a prime num");
			}
		}else {
			System.out.println("not a prime num");
		}
	}

}
