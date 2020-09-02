package mainjava2;

public class InnerClassDemo {
	public static void main(String[] args) {
		
		//https://www.tutorialspoint.com/java/java_innerclasses.htm
		//Outer class can never be private. Inner class can be made private
		//Private variable outer class can be accessed by inner class
		Outer o=new Outer();
		Outer.Inner i=o.new Inner(); //Observe that we used outerObject.new InnerClass()
		o.outerClassMethod();
		i.innerClassMethod();
	}
}

class Outer{
	int outerVar;
	public void outerClassMethod() {
		System.out.println("Outer Class Method");
	}
	class Inner{	
		int innerVar;
		public void innerClassMethod() {
			System.out.println("Inner  Class Method");	
		}
	}
}

