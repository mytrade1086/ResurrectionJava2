package mainjava2;

import java.io.IOException;
//Rule#1 : If the super-class overridden method does not throw an exception, subclass overriding method can only
//throws the unchecked exception, throwing checked exception will lead to compile-time error.
public class OverridingParentClasswithNoException extends Overriding_ParentWith_NO_Exception {

@Override
public void MethodNoException() throws ArithmeticException {		
//	Notice that we have thrown one unchecked exception and it did not give error
//	Parent class method has no exception
		System.out.println("Overriding Method in Child  with no exception");
	}

//@Override
//public void MethodNoException() throws IOException {		
//	//Notice that we have thrown one checked exception and it did give error
//	// Exception IOException is not compatible with throws clause in Overriding_ParentWith_NO_Exception.MethodNoException()
//	//Parent class method has no exception
//		System.out.println("Overriding Method in Child  with no exception");
//	}
//	



	
	
public static void main(String[] args) {
	OverridingParentClasswithNoException or=new OverridingParentClasswithNoException();
	or.MethodNoException();
	
}
}
