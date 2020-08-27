package mainjava2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {
		
	
	FileReader f=new FileReader(System.getProperty("user.dir") + "//src/main/java/mainjava2/inputstream.txt");
	BufferedReader br=new BufferedReader(f);
	//int ch;
//	while((ch=br.read())!= -1) {	
//		System.out.println(br.readLine);     //THIS approch skipping intial character of each line
//	}
//	
	
	String line;
	while ((line=br.readLine()) !=null) {
		System.out.println(line);
	}
		
	}
	
}
