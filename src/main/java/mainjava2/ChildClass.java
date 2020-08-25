package mainjava2;

public class ChildClass extends Parent{
public String name;
	public ChildClass(int bal, String name) {
		super(bal, name);
	}

	
	public static void main(String[] args) {
		Parent p=new Parent(20, "Sumit");
		p.normalMethod();  //
		staticMethod();//
		//p.privateMethod(); private method not visible in subclass as expected
		
	}
	
	
	
	

}
