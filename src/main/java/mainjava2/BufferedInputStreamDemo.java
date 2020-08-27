package mainjava2;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInputStreamDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(System.getProperty("user.dir") + "//src/main/java/mainjava2/inputstream.txt");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		BufferedInputStream bis = new BufferedInputStream(fis);
		int ch;
		while ((ch = bis.read()) != -1) {
			System.out.println((char)bis.read());
		}

	}
}
