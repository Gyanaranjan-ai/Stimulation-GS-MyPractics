//Singletone

public class A {
	
	private static A instance;
	
	private A() {
		
	}
	public static A getInstance() {
		if(instance==null) {
			synchronized (A.class) {
				if(instance==null) {
			instance=new A();
		}
		}
		}
		return instance;
	}
	
	public void name() {
		System.out.println("singletone in");
	}
	
	public static void main(String[] args) {
		A instance2 = A.getInstance();
		instance2.name();
	}
}
