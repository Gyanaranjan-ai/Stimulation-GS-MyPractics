package java8;

public class LearnInterface {
	public static void main(String[] args) {
		Monkey a= new Monkey();
		a.eat();
		a.walk();
		a.drink();
		System.out.println(Animal.legs);
		a.sing();
		Human.run();
	}
}


interface Animal{
	void eat();
	void drink();
	//by default variable are static final
//	public static final int legs=4;
	 int legs=4;
}
class Monkey implements Animal,Human{

	@Override
	public void eat() {
		System.out.println("monkey is eating");
		
	}

	@Override
	public void walk() {
		System.out.println("Man is walking");
		
	}

	@Override
	public void drink() {
		System.out.println("Monkey is Drinkgin");
		
	}
	
}

interface Human{
	void walk();
	void drink();
	//use deafult & static keyword we can create complete method in Interface
	default void sing(){
		System.out.println("human is singing");
	}
	static void run() {
		System.out.println("Man is running");
	}
}
