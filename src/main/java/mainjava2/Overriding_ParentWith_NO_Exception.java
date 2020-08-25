package mainjava2;

public class Overriding_ParentWith_NO_Exception {

	
//	Rule#1 : If the super-class overridden method does not throw an exception, 
//	subclass overriding method can only throws the unchecked exception, throwing checked exception will lead to compile-time error.
	
	
/*
 * Rule#2 : If the super-class overridden method does throws an exception,
 * subclass overriding method can only throw same, subclass exception. Throwing
 * parent exception in Exception hierarchy will lead to compile time error. Also
 * there is no issue if subclass overridden method is not throwing any
 * exception.
 */
	
	
	public void MethodNoException() {
		
		System.out.println("Method in Parent  with no exception");
	}
	
	
	
}
