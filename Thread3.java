package practice;

class MyThread1 extends Thread{
	@Override
	public void start() {
		System.out.println("start() of Thread class");
	}
	@Override
	public void run() {
		for(byte i =0;i<=5;i++) {
			System.out.println("CHILD THREAD");
		}
	}
}
public class Thread3 {
	public static void main(String ...args) {
		MyThread1 t = new MyThread1();
		t.start();
		System.out.println("MAIN THREAD");
	}
}
