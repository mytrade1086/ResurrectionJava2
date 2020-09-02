package mainjava2;

public class GenericMethodDemo {

	
	public static void main(String[] args) {
		printArray(new Integer[]{2,5,5,3});
		printArray(new String[] {"Sagar","Neha","Ajay"});
	}
	//<E> should precede return type
	//GenericMethod 
	public static <E> void printArray(E[] somevalue){
		for(E s:somevalue) {
			System.out.println(s);
		}
		
		
	}
}

