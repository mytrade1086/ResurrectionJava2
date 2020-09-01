package mainjava2;


class parent{}
class child extends parent{}

public class Instanceof {

	
	public static void main(String[] args) {
   
		child c=new child();
		parent p=new parent();
		
		parent pc=new child();
		
		
		if(c instanceof child) {
			System.out.println("c instance of child");
		}
		
		else {
			System.out.println("c is NOT an instance of child");
	}
		
		if(p instanceof parent) {
			System.out.println("p instance of parent");
		}
		
		else {
			System.out.println("p is NOT an instance of parent");
	}
		
		if(pc instanceof child) {
			System.out.println("pc instance of child");
		}
		
		else {
			System.out.println("pc is NOT an instance of child");
	}
			
		}
		
	}

