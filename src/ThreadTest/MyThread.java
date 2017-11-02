package ThreadTest;

public class MyThread extends Thread {

	public MyThread(String name) {
		super(name);
	}

	
	@Override
	public void run() {
		System.out.println("Mythread is in process."+ Thread.currentThread().getName());
	}


	public static void main(String[] args) {
		MyThread thread = new MyThread ("MyThread");
		thread.start();
	}

}
