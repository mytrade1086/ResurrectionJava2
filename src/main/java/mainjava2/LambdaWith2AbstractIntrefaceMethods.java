package mainjava2;

public class LambdaWith2AbstractIntrefaceMethods {

	public static void main(String[] args) {
		
		InterfaceWith2AbstractMethods demo= (value->System.out.println(value)); 
		// ERROR: The target type of this expression must be a functional interface
		//Because we have two abstract method in INTERFACE,we are getting above error
		demo.one(8);
		
	}

	

}
