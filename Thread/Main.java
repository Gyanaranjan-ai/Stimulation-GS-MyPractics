package Thread;

public class Main {
	
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		Thread th = new Thread(mt);
		th.start();
	}

}
