package mainjava2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ExceptionChecked {
//	Checked: are the exceptions that are checked at compile time. 
//	If some code within a method throws a checked exception, then the method must either handle the exception or 
//	it must specify the exception using throws keyword

	// Below program wont complile unless we add "throws IOException" or use try
	// catch block surrounding p.load(fi)

	public static void main(String[] args) throws IOException {

		try {
			FileInputStream fi = new FileInputStream(
					System.getProperty("user.dir") + "//src/main/java/mainjava2/demo.properties");
			Properties p = new Properties();
			p.load(fi);
			System.out.println(p.getProperty("username"));// sumit

			p.setProperty("newKey", "newValue");// created newkey and value
			System.out.println(p.getProperty("newKey"));

			System.out.println(p.getProperty("nonExistingKey"));// returns null for non existing key

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
	}

}
