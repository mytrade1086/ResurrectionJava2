package mainjava2;

public class AbstractClassImplementing extends AbstractClassWithMethod {

	@Override
	public void demoAbstract() {
	System.out.println("Implemented Abstract Method");
		
	}
	
	
	public static void main(String[] args) {
		AbstractClassImplementing ac=new AbstractClassImplementing();
		ac.demoAbstract(); //Implemented Abstract Method
	}
}
