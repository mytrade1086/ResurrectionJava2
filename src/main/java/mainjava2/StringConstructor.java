package mainjava2;

public class StringConstructor {

	
	public static void main(String[] args) {
		
		//#1
		String name="Sumit";
		System.out.println("Plain decalaration  "+name);
		
		//#2
		String college=new String("college");
		System.out.println("Decalaration with new   "+college);
		
		//#3 Byte array
		byte [] br= {65,66,67,68,69};
		String strbr=new String(br);
		System.out.println("Printing String made from byteArray "+strbr );//ABCDE
		
		char []ca= {'a','b','c','f'};
		String strca=new String(ca);
		System.out.println("Printing String made from charArray "+strca );//abcf
		
		
		
//		String(char[] char_array, int start_index, int count) – 
//		Allocates a String from a given character array but choose count characters from the start_index.
//		Example:
		char char_arr[] = {'G', 'e', 'e', 'k', 's'};
		String s = new String(char_arr , 1, 3); //eek
		System.out.println("Printing String made from charArray "+s );//eek
		
		
		
//		String(byte[] byte_arr, int start_index, int length) – 
//		Construct a new string from the bytes array depending on the start_index(Starting location) and length(number of characters from starting location).
//		Example:
		byte[] b_arr = {71, 65, 101, 107, 115};
		String strBarray = new String(b_arr, 1, 3); // eek
		System.out.println("Printing String made from byteArray "+strBarray );//Aek
		
			
		StringBuffer s_buffer = new StringBuffer("Geekshj");
		String stra = new String(s_buffer);
		System.out.println("Printing String made from StringBuffer "+stra);
		
//		String(StringBuilder s_builder) – Allocates a new string from the string in s_builder
//		Example:
		StringBuilder s_builder = new StringBuilder("Geeks");
		String sb = new String(s_builder); //Geeks
		System.out.println("Printing String made from StringBuffer "+sb);

	}
}
