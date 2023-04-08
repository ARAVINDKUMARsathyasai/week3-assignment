package IOPackage;

import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

public class IOProgram3 {
	public static void main(String ...args) throws IOException {
		FileWriter fw = new FileWriter("C:\\\\Users\\\\Admin\\\\OneDrive\\\\Desktop\\\\abc.txt");
		
		BufferedWriter br = new BufferedWriter(fw);
		
		br.newLine();
		br.write(65);
		br.write("xis Manipal");
		br.newLine();
		br.write("for");
		br.newLine();
		br.write("technology");
		br.newLine();
		br.write("training");
		br.newLine();
		
		char[] c = {'X','Y','Z'};
		br.write(c);
		br.flush();
		
		br.close();
	}
}
