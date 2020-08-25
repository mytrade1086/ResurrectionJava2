package mainjava2;

public class ACconstructorDemo extends AbstractClassHasConstructor {

	
	
	public ACconstructorDemo() {
		System.out.println("from implementing class");	
	}
	
	public ACconstructorDemo(int val) {
		super(val);
			
	}
	
	public static void main(String[] args) {
		
		
		
		
		ACconstructorDemo demo=new ACconstructorDemo(); //from default constructor of abstract class
		System.out.println(demo.bal);//0
		System.out.println(min);//0
       
		ACconstructorDemo pc=new ACconstructorDemo(20);
		
		
	}
}
