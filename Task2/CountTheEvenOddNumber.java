
public class CountTheEvenOddNumber {

	public static void main(String[] args) {
	Integer num=26783;
	int even=0;
	int odd=0;
	while(num>0) {
		if(num%2==0) {
			even++;
		}else {
			odd++;
		}
		num=num/10;
	}
	System.out.println("even="+even +",odd ="+odd);
	}

}
