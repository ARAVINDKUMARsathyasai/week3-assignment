package practice;

class MyThread extends Thread{
	@Override
	public void run() {
		for(byte i = 0;i<=5;i++) {
			System.out.println("CHILD THREAD");
		}
	}
}

public class ThreadsExample {
	public static void main(String ...args) {
		MyThread mt = new MyThread();
		mt.start();
		
		for (byte i = 0;i<=5;i++) {
			System.out.println("Main thread");
		}
	}
}
