package pattern;

public class Print1to100 {
	
	//recursive call
	public static void main(String[] args) {
		printNumber(1);
	}
	public static void printNumber(int n) {
		if(n<=10) {
			System.out.println(n);
		printNumber(n+1);
		}
	}

}
