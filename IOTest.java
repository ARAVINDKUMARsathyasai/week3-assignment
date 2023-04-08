package IOPackage;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class IOTest {
	public static void main(String ...args)throws IOException {
		FileReader fr = new FileReader("C:\\Users\\Admin\\OneDrive\\Desktop\\abc.txt");
		
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
		
		while(line!=null) {
			System.out.println(line);
			line=br.readLine();
		}
		br.close();
	}
}
