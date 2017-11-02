package ThreadTest;

public class MyRunnable implements Runnable {

	public void run() {
		System.out.println("Executing thread : "+Thread.currentThread().getName());
		
	}
	
	public static void main(String[] args) {
		Thread t = new Thread(new MyRunnable(),"MyRunnable");
		t.start();

	}
}
