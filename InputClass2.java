package IOPackage;

import java.io.FileReader;
import java.io.IOException;
import java.io.File;

public class InputClass2 {
	public static void main(String ...args)throws IOException {
		File f = new File("C:\\Users\\Admin\\OneDrive\\Desktop\\abc.txt");
		FileReader fr = new FileReader(f);
		
		char [] ch = new char[(int)f.length()];
		fr.read(ch);
		
		String data = new String(ch);
		System.out.println(data);
		
		fr.close();
	}
}
