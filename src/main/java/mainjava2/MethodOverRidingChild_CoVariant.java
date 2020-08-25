package mainjava2;

public class MethodOverRidingChild_CoVariant  extends MethodOverRidingParent_CoVariant {

	//# Object(Parent)===>String/Stringbuffer(Child) is okay. Reverse not allowed
	//Notice that getName has Object as return type
	//Notice that here in child, String is return type. No Error is thrown
	
	
	@Override
	public String getname(String name) {
		System.out.println("Inside Child");
		return name;
	}
	
	public static void main(String[] args) {
		MethodOverRidingChild_CoVariant c=new MethodOverRidingChild_CoVariant();
		c.getname("sumit"); //Inside Child
		
	}
}
