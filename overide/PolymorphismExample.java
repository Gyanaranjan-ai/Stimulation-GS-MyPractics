package overide;

//Superclass
class Animal {
	void makeSound() {
		System.out.println("Animal makes a sound");
	}
}

//Subclass
class Dog extends Animal {
	@Override
	void makeSound() {
		System.out.println("Dog barks");
	}
}

//Another Subclass
class Cat extends Animal {
	@Override
	void makeSound() {
		System.out.println("Cat meows");
	}
}

public class PolymorphismExample {
	public static void main(String[] args) {
		  // Reference variable of type Animal
		Animal a= new Animal();
		a.makeSound();

		 Animal myAnimal = new Dog(); // myAnimal refers to a Dog object
		myAnimal.makeSound(); // Calls the Dog's makeSound method

		Animal myAnimal1 = new Cat(); // myAnimal now refers to a Cat object
		myAnimal1.makeSound(); // Calls the Cat's makeSound method
		
	}
}
