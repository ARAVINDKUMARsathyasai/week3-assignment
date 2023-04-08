package practice;
class MThread1 extends Thread{}

public class Thread4  {
	public static void main(String args[]) {
		MThread1 t4 = new MThread1();
		t4.start();
		for(byte i =0;i<3;i++) {
			System.out.println("MAIN THREAD");
		}
	}
}
