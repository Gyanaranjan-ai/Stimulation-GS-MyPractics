package Thread;

public class AnonThread {
	public static void main(String[] args) {
//		Runnable runnable = new Runnable() {
//			
//			@Override
//			public void run() {
//				
//				System.out.println("This is thread class ");
//			}
//		};
//			Thread th = new Thread(runnable);
//			th.start();
//			
			//using lambda
			Runnable r=()->{
				System.out.println("This is lambda");
			};
			Thread th = new Thread(r);
			th.start();
//			
		
	}

}
