package java8;

public class LearnAnonymsClass {
	OuterClass o = new OuterClass() {
		void sing() {
			
		}
	};
	void run() {
		System.out.println("not run");
	}
	SuperInterFace s = new SuperInterFace() {
		
		@Override
		public void swap() {
			System.out.println("Swap done");
			
		}
	};
	
	public static void main(String[] args) {
		LearnAnonymsClass l = new LearnAnonymsClass();
		l.run();
		l.s.swap();
		l.o.run();
	}

}
class OuterClass{
	void run() {
		System.out.println("running");
	}
}

interface SuperInterFace{
	void swap();
}
