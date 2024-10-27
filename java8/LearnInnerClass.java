package java8;

public class LearnInnerClass {
	
	//Nested class
	//NonStatic iner class;
	class Toy{
		int price;
	}
	
	
	static class Teedy{
		int pricee;
	}
	public static void main(String[] args) {
		Toy t= new LearnInnerClass().new Toy();
		t.price=450;
		
		Teedy td = new LearnInnerClass.Teedy();
		td.pricee=32;
	}
}
