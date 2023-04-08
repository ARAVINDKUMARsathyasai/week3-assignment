package IOPackage;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.io.Externalizable;
import java.io.ObjectOutput;
import java.io.ObjectInput;

class ExternalizableDemo implements Externalizable{
	String i;
	int j;
	int k;
	public ExternalizableDemo() {
		System.out.println("Constroctor called during DeSeialization JVM");
	}
	ExternalizableDemo(String i, int j , int k){
		this.i = i;
		this.j = j;
		this.k = k;
	}
	
	public void writeExternal(ObjectOutput out)throws IOException {
		System.out.println("Called during Serialization");
		out.writeObject(i);
		out.writeInt(j);
	}
	
	public void readExternal(ObjectInput in)throws IOException,ClassNotFoundException {
		System.out.println("Called during DeSerialization");
		
		i = (String)in.readObject();
		j=in.readInt();
	}
	
}

public class IOPackage {
	public static void main(String ...args) throws IOException,ClassNotFoundException{
		ExternalizableDemo d = new ExternalizableDemo("ARAVINDKUMAR SATHYASAI BOBBA",100,200);
		System.out.println(d.i+"=========>"+d.j+"========>"+d.k);
		
		System.out.println("Serialization started");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Admin\\OneDrive\\Desktop\\abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d);
		System.out.println("Serialization ended");
		
		System.out.println("*****************************************");
		
		System.out.println("De-Serialization started");
		FileInputStream fis = new FileInputStream("C:\\\\Users\\\\Admin\\\\OneDrive\\\\Desktop\\\\abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ExternalizableDemo d1 = (ExternalizableDemo)ois.readObject();
		System.out.println(d1.i+"==============>"+d1.j+"=================>"+d1.k);
		System.out.println("Deserialization ended");
	}
}
