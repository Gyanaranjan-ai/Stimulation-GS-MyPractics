package java8;

public class LearnAbstract {
	public static void main(String[] args) {
		//we cant create the bobj
//		VSechile v = new Vechile() ;
		Vechile v = new Car();
		v.acceleater();
		v.wheel(3);
		v.breaak();
		
	}

}



abstract class Vechile{
	abstract void acceleater() ;
	abstract int wheel(int wheel);
	void breaak() {
		System.out.println("break");
	}
	
}
class Car extends Vechile{

	@Override
	void acceleater() {
		System.out.println("start");
		
	}

	@Override
	int wheel(int wheel) {
		System.out.println(wheel);
		return wheel;
	}
	
}