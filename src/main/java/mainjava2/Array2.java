package mainjava2;

public class Array2 {

	public static void main(String[] args) {

		int[] demo = new int[3]; // physical size is denoted
		System.out.println(demo.length); // 3     index will be[ 0 1 2 3]
		System.out.println(demo.getClass());
		for (int i = 0; i < demo.length; i++) {
			System.out.println("int array. index:" + i + " " + demo[i]);
			
			// Default values of integer printed
//			int array. index:0 0
//			int array. index:1 0
//			int array. index:2 0
		}

		String[] strArray = new String[3]; // physical size is denoted
		System.out.println(strArray.length); // 3 [ 0 1 2 3]
		for (int i = 0; i < strArray.length; i++) {
			System.out.println("String array. index:" + i + " " + strArray[i]);
			// Default values of String printed
//			String array. index:0 null
//			String array. index:1 null
//			String array. index:2 null
		}

		Object[] objArray = new Object[3]; // physical size is denoted
		System.out.println(objArray.length); // 3 [ 0 1 2 3]
		for (int i = 0; i < objArray.length; i++) {
			System.out.println("Object array. index:" + i + " " + objArray[i]);
			// Default values of Object printed
//			Object array. index:0 null
//			Object array. index:1 null
//			Object array. index:2 null
		}

		// Iterate with for each
		for (Object o : objArray) {
			System.out.println("Used For EACH in ObjectArray " + o);
		}
//		Used For EACH in ObjectArray null
//		Used For EACH in ObjectArray null
//		Used For EACH in ObjectArray null

		int[] demo2 = new int[3];
		demo2[0] = 0;
		demo2[1] = 1;
		demo2[2] = 2;
		for (int i : demo2) {
			System.out.println("Used For EACH in intArray " + i);
		}
//		Used For EACH in intArray 0
//		Used For EACH in intArray 1
//		Used For EACH in intArray 2
		
		
		char[] arrChar = new char[3];
		for (char i : arrChar) {
			System.out.println("Used For EACH in arrChar " + i);
		}
		

	}

}
