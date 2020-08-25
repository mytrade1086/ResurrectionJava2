package mainjava2;

public class AbstractClassHasConstructor {

	public int bal;
	public static int min;
	
	public AbstractClassHasConstructor() {
		System.out.println("from default constructor of abstract class");	
	}

	//Parameterized constructor present. Not sure if we can call it in sub class
	public AbstractClassHasConstructor(int bal) {
		this.bal = bal;
	}
	
	
	
}
