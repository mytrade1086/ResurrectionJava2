package mainjava2;

public class Exception_Demo1 {

	public static void main(String[] args) {	
       try {
		   method1();
			
	} catch (ArithmeticException e) {
		//System.err.println(e.getMessage());
		//e.printStackTrace();
		System.out.println("inside main");
		
	}

	}

	public static void method1() {
		method2();
		System.out.println("inside method1");
	}

	public static void method2() {
		int c = 2 / 0;
		System.out.println("inside method2");
	}
}
