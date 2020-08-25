package mainjava2;

public class MethodOverLoading {

	public static void main(String[] args) {

		// 1 Methods with same name but different parameters
		// 2 Return type does not matter
		
		
		MethodOverLoading ol=new MethodOverLoading();
		ol.area(10);
		ol.area(10,20);
		ol.area(10,20,30);
		
	}

	public int area(int breadth, int length) {
		System.out.println("inside int return with 2 params");
		return 0;
	}

	public float area(float sidelength) {
		System.out.println("inside float return");
		return 0.0f;
	}

	public int area(int one, int two, int three) {
		System.out.println("inside int return with 3 params");
		return 0;

	}

}
