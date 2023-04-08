package practice;

class Threads extends Thread{
	@Override
	public void run() {
		System.out.println("Zero arg run()");
	}
	//specialized method
	public void run(int i) {
		System.out.println("one arg run()");
	}
}

public class Thread5 {
	public static void main(String ...args) {
		Threads tt = new Threads();
		tt.start();
		System.out.println("MAIN THREAD");
	}
}
