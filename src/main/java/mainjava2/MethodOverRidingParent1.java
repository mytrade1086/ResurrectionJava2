package mainjava2;

public class MethodOverRidingParent1 {

	public float area(int breadth, int length) {
		int area = breadth * length;
		System.out.println("this is  method in parent class. Area is "+area);
		return area;
	}

	public void normaMethod() {
		System.out.println("this is normal method in parent class");
	}

	public static void mystatic() {
		System.out.println("Static method in parent");
	}

}
