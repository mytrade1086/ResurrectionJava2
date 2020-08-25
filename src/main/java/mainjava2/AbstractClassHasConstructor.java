package mainjava2;

public abstract class AbstractClassHasConstructor {

	public int bal;
	public static int min;
	
	public AbstractClassHasConstructor() {
		System.out.println("from default constructor of abstract class");	
	}

	//Parameterized constructor present. super of subclass can reach this section
	public AbstractClassHasConstructor(int bal) {
		this.bal = bal;
		System.out.println("Called Parameterized Constructor with value:"+bal);
	}
	
	
	
}
