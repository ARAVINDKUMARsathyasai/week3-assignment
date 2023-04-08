package practice;

class MyThread extends Thread{
	@Override
	public void run() {
		for(byte i = 0;i<=5;i++) {
			System.out.println("Child Thread");
		}
	}
}
public class Threads2 {
	public static void main(String ...args) {
		MyThread t = new MyThread();
		t.run();
		
		for(byte i = 0; i<5;i++) {
			System.out.println("MAIN THREAD");
		}
	}
}