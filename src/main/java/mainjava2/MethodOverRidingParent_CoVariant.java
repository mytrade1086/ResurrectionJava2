package mainjava2;

public class MethodOverRidingParent_CoVariant {

	//# Object(Parent)===>String/Stringbuffer(Child) is okay. Reverse not allowed
	
	
	public Object getname(String name) {
		System.out.println("From Parent");
		return name;
	}
}
