package mainjava2;

public class MethodOverLoading_Promotion_OutSideFamily {

	public static void main(String[] args) {

		// 1 Methods with same name but different parameters
		// 2 Return type does not matter

		// # 3 Note that in below example we passed char 'A' and we dont have any method
		// accepting char.
		// So it jumped to same higher type within same family. i.e
		// byte->short>chat->int

		
		
		/*
		 * Type conversion to next higher family (suppose if there is no long data type
		 * available for an int data type, then it will search for the float data type).
		 */

		MethodOverLoading_Promotion_OutSideFamily ol = new MethodOverLoading_Promotion_OutSideFamily();
		ol.area(10); // inside float arg
	}

	public float area(float arg1) {
		System.out.println("inside float  arg");
		float area = arg1 * arg1;
		return area;
	}
	
	
	
}
