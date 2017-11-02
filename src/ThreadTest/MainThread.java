package ThreadTest;

import java.lang.Thread.State;

public class MainThread {

	public MainThread() {
		// TODO Auto-generated constructor stub
	}
	public static void main (String[] args) {
		String threadName = Thread.currentThread().getName();
		long id = Thread.currentThread().getId();
		State threadState = Thread.currentThread().getState();
		System.out.println(threadName);
		System.out.println(id);
		System.out.println(threadState);
		System.out.println(Thread.currentThread().getThreadGroup());
		
	}
}
