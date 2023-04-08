package practice;

class MyThreadd extends Thread{}

public class TestApp {
	public static void main(String ...args) {
		System.out.println(Thread.currentThread().isDaemon()); //false
		MyThreadd t = new MyThreadd();
		System.out.println(t.isDaemon()); // fasle
		t.start();
		t.setDaemon(true); //IllegalThreadStateException
		System.out.println(t.isDaemon());
	}
}
