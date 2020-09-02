package mainjava2;

public class InnerClassStatic {
	
	public static void main(String[] args) {
	
		Outer.Inner demo=new Outer.Inner();
		demo.innerClassMethod();
	}
	
}


class Outer{
	int outerVar;
	public void outerClassMethod() {
		System.out.println("Outer Class Method");
	}
	static class Inner{
		
		int innerVar;
		public void innerClassMethod() {
			System.out.println("Inner  static Class Method");	
		}
	}
}