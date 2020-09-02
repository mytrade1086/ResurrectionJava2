package mainjava2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationDemo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2763498655451442080L;
	public String name;
	public static String college;
	public int marks;
	
	public SerializationDemo(String x ,String y,int z) {
		name=x;
		college=y;
		marks=z;
	}
	
	
	public static void main(String[] args) throws IOException {
		SerializationDemo sd=new SerializationDemo("sumit","KITS",76);
		 FileOutputStream fileOut =
		         new FileOutputStream("src/main/java/mainjava2/SerializationJava.txt");
		 
		ObjectOutputStream out=new ObjectOutputStream(fileOut);
		 out.writeObject(sd);
		 out.close();
         fileOut.close();
		
	}

}
