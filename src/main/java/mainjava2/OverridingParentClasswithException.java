package mainjava2;

public class OverridingParentClasswithException {

	
	public void parentmethod1() throws ArithmeticException {
		
		System.out.println("parentmethod  has exception");
		
	}
	
	
public void parentmethod2() throws NullPointerException {
		
		System.out.println("parentmethod2  has exception");
		
	}


public void parentmethod3() throws NullPointerException {
	
	System.out.println("Parent method has NullPointerException");
	
}
}
