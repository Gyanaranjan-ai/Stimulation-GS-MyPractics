package Thread;

public class DaemonThread extends Thread{
	
	@Override
	public  void run() {
		if(Thread.currentThread().isDaemon())
		System.out.println("daemon Thread");
		else
			System.out.println("child Thread");
	}
	public static void main(String[] args) {
		
//		we cant made main thread as daemon thread
//		Thread.currentThread().setDaemon(true);
		
		System.out.println("Main thread");
		DaemonThread dh = new DaemonThread();
		dh.setDaemon(true);
		dh.start();
		
//		After  satarting the thread we cant set dameon thread
//		dh.setDaemon(true);

	}
}
