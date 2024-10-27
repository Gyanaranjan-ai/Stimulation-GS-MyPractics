package string;

public class Immutable {
	public static void main(String[] args) {
		String s= new String("Gyana");
		s.concat("Milu");
		
		System.out.println(s);
//		Immutable class we can change the object but in final we can't change 
		s=s.concat("Ranjan ");
		System.out.println(s+"___");
		
		 final StringBuffer sb = new StringBuffer("Milu");
		//If u make string final we cann't Modify
//		sb=sb.append("gyana");
		System.out.println();
	}

}
