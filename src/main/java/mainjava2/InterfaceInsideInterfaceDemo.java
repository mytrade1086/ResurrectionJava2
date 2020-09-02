package mainjava2;

public class InterfaceInsideInterfaceDemo implements A,A.Aa {
	//Notice here that We need to implement both of them incase we want methods from both of them
	//If only single , we can use implements A
	//or implements A.aa 

	public static void main(String[] args) {
		
		InterfaceInsideInterfaceDemo aid=new InterfaceInsideInterfaceDemo();
		aid.methodA();
		aid.methodAa();
		
		
		A a=new InterfaceInsideInterfaceDemo();
		a.methodA();
		
		
		A.Aa aa=new InterfaceInsideInterfaceDemo();
		aa.methodAa();
		
	}

	@Override
	public void methodAa() {
		
		System.out.println("From Aa");
	}

	@Override
	public void methodA() {
		System.out.println("From A");
		
	}
	
	
}


interface A{
	
	public void methodA();
	interface Aa{
		
		public void methodAa();	
	}
	
}
