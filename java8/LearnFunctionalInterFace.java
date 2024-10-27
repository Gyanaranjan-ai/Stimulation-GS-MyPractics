package java8;

public class LearnFunctionalInterFace {
	public static void main(String[] args) {
		Learning l=()->{
			System.out.println("Study");
		};
		l.study();
		Man m=(steps)-> steps;
		System.out.println(m.walks(5));
	}
	

}

@FunctionalInterface
interface Learning{
	void study();
}

@FunctionalInterface
interface Man{
	int walks(int steps);
}