package Thread;

public class MyThreadR extends Thread{
	@Override
	public void run() {
		for (int i = 1; i < 5; i++) {
			System.out.println(i*5);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		MyThreadR mr = new MyThreadR();
		mr.start();
	}
}
