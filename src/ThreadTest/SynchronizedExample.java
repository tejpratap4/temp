package ThreadTest;

public class SynchronizedExample implements Runnable {
	private static Integer sync = 0;

	public static void main(String[] args) throws InterruptedException {
		Thread[] th = new Thread[5];

		for (int i = 0; i < th.length; i++) {
			th[i] = new Thread(new SynchronizedExample(), "Thread-" + i);
			th[i].start();
		}

		for (int i = 0; i < th.length; i++) {

			th[i].join();
		}

	}

	/*
	 * public int getCounter() { return sync; }
	 * 
	 * public int incrementCounter() { sync++; return sync; }
	 */

	/*@Override
	public void run() {
		synchronized (SynchronizedExample.class) {
			System.out.println(Thread.currentThread().getName() + "  " + sync);
			sync++;
			System.out.println(Thread.currentThread().getName() + "  " + sync);
		}
	}*/
	
	@Override
	public void run() {
		synchronized (SynchronizedExample.class) {
			System.out.println(Thread.currentThread().getName() + "  " + sync);
			sync++;
			System.out.println(Thread.currentThread().getName() + "  " + sync);
		}
	}

}
