package ThreadTest;

import java.util.Random;

public class JoinExample implements Runnable  {
	 private Random rand = new Random(System.currentTimeMillis());
	public JoinExample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Thread[] th = new Thread[5];
		for (int i=0;i<5;i++) {
			th[i] = new Thread(new JoinExample(),"Thread-"+i);
			th[i].start();
		}
		for (int i=0;i<5;i++) {
			try {
				th[i].join();
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
		}
		System.out.println("["+Thread.currentThread().getName() +"] All thread has finished.");

	}

	@Override
	public void run() {
		for (int i=0;i<500000;i++) {
			rand.nextInt();
		}
		System.out.println("["+ Thread.currentThread().getName()+"] finished.");
	}

}
