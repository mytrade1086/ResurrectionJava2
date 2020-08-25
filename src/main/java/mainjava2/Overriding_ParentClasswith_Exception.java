package mainjava2;

public class Overriding_ParentClasswith_Exception extends OverridingParentClasswithException {
	/*
	 * If the super-class overridden method does throws an exception, subclass
	 * overriding method can only throw same, subclass exception. Throwing parent
	 * exception in Exception hierarchy will lead to compile time error.Also there
	 * is no issue if subclass overridden method is not throwing any exception.
	 */

//Case 1: same exception as parent class
	@Override // this is Fine as same exception as parent class
	public void parentmethod1() throws ArithmeticException {

		System.out.println("Chid  method has exception");

	}

//Case 2: Parent throws exception. Child does not 
	@Override // this is Fine as same exception as parent class
	public void parentmethod2() {
		System.out.println("Child class not throwing parent class  method  exception");
	}

	//Case 3: Parent throws exception. Child tried to throw exceptions super 
	//Error: //Case 2: Parent throws exception. Child does not 
	public void parentmethod3() throws Exception {
		System.out.println("Parent method has NullPointerException");

	}

	public static void main(String[] args) {

	}

}
