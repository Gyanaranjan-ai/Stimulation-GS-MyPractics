package Thread;

public class NumberThread1to50 implements Runnable{
	 private int start;
	    private int end;

	    public NumberThread1to50(int start, int end) {
	        this.start = start;
	        this.end = end;
	    }

	    @Override
	    public void run() {
	        for (int i = start; i < end; i++) {
	            System.out.println(Thread.currentThread().getName() + ": " + i);
	        }
	    }

	    public static void main(String[] args) {
	        Thread t1 = new Thread(new NumberThread1to50(1, 11), "Thread 1");
	        Thread t2 = new Thread(new NumberThread1to50(11, 21), "Thread 2");
	        Thread t3 = new Thread(new NumberThread1to50(21, 31), "Thread 3");
	        Thread t4 = new Thread(new NumberThread1to50(31, 41), "Thread 4");
	        Thread t5 = new Thread(new NumberThread1to50(41, 51), "Thread 5");

	        try {
	            t1.start();
	            t1.join(); // Waits for t1 to finish

	            t2.start();
	            t2.join(); // Waits for t2 to finish

	            t3.start();
	            t3.join(); // Waits for t3 to finish

	            t4.start();
	            t4.join(); // Waits for t4 to finish

	            t5.start();
	            t5.join(); // Waits for t5 to finish
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }


	        System.out.println("All threads have finished execution.");
	    }
	}


