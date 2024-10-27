package java8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MainJava8 {
	public static void main(String[] args) {
		//predict
		Predicate<String> checkLength=e->e.length()>5;
		System.out.println(checkLength.test("Miluew"));// true
		//Consumer
		Person p = new Person();
		Consumer<Person> setName= e->e.setName("milu don");
		setName.accept(p);
		System.out.println(p.getName());//milu don
		//Function
		Function< Integer, String> getInt =e->e*10+"get Value";
		System.out.println(getInt.apply(2));//20get Value
		//
		Supplier<Double> getRandomNum=()->Math.random();
		System.out.println(getRandomNum.get()); //it will print Random Num
	}
}
class Person{
	private String name;
	//getter Setter

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
