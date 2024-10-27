package Thread;

public class MyTotalEarning extends Thread{
	int total=0;
	@Override
	public void run() {
		synchronized (this) {
			
		for (int i = 0; i <5; i++) {
			total=total+200;
		}
		this.notify();
		}
	}
	public static void main(String[] args) throws InterruptedException {
		MyTotalEarning me = new MyTotalEarning();
		me.start();
		
		System.out.println(me.total);
		
		synchronized (me) {
			me.wait();
			System.out.println(me.total);

		}
	}
}
