package practice;

class A{
	public synchronized void d1(B b) {
		System.out.println("Thread-1 started executing d1()");
		try {
			Thread.sleep(5000); //5sec
		}
		catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("Thread-1 trying to call b.last()");
		b.last();
	}
	public void last() {
		System.out.println("A class last() method");
	}
}

class B{
	public synchronized void d2(A a) {
		System.out.println("Thread-2 started executing d2()");
		try {
			Thread.sleep(5000); //5 sec
		}
		catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("Thread-2 trying to call a.last()");
		a.last();
	}
	public void last() {
		System.out.println("B class last() method");
	}
}

public class TestAppThread7 extends Thread{
	A a = new A();
	B b = new B();
	
	public void m1() {
		this.start();
		a.d1(b);
	}
	@Override
	public void run() {
		b.d2(a);
	}
	public static void main(String args[]) {
		TestAppThread7 t = new TestAppThread7();
		t.m1();
	}
}
