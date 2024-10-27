
public class PalimdromNumber {
	
	public static void main(String[] args) {
		int num =12321;
		int org_num = num;
		int rev=0;
		while(num!=0){
			rev = rev*10+num%10;
			num = num/10;
		}
		if (org_num==rev) {
			System.out.println("It is a palindrum Number");
		}else
			System.out.println("It is not a palindrum");
	}
}
