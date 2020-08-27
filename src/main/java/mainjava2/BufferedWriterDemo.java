package mainjava2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	public static void main(String[] args) throws IOException {
		
	
	FileWriter fw=new FileWriter(System.getProperty("user.dir")+"//src/main/java/mainjava2/BufferedWriter.txt");
	
	BufferedWriter bw=new BufferedWriter(fw);
	
	bw.append("new line via code gh");
	bw.write("write line");
	bw.close();
	fw.close();
	
	
	
	
}
}