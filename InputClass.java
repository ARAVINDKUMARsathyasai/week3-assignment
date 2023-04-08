package IOPackage;

import java.io.FileReader;
import java.io.IOException;

public class InputClass {
	public static void main(String ...args)throws IOException {
		FileReader fr = new FileReader("C:\\Users\\Admin\\OneDrive\\Desktop\\abc.txt");
		int i=fr.read();
		while(i!=-1) {
			System.out.print((char)i);
			i=fr.read();
		}
	}
}
