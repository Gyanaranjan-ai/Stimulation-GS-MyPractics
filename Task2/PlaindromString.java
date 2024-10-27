
public class PlaindromString {
	public static void main(String[] args) {
		String str ="ABA";
		String orgstS=str;
		StringBuffer sb =new StringBuffer(str);
		String string = sb.reverse().toString();
		if(string.equals(orgstS))
			System.out.println("Palindru");
		else {
			System.out.println("Not Plaindrum");
		}
	}

}
